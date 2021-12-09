package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import dtos.BaseCountries;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class Main {
	/**
	* Timeout in milliseconds.
	* author: Yusuf
	*/
	static final int TIMEOUT = 5000;
	/**
	* Status range.
	* author: Yusuf
	*/
	static final int RANGE = 299;
	/**
	 * Extracting json file from URL address.
	 * @param args
	 * @throws WriteException
	 */
	public static void main(String[] args) throws WriteException {

			BufferedReader reader;
			String line;
			StringBuilder responseContent = new StringBuilder();
			try {
				URL url =
				new URL("https://restcountries.com/v3.1/all");
				HttpURLConnection connection = (HttpURLConnection) url.openConnection();

				connection.setRequestMethod("GET");
				connection.setConnectTimeout(TIMEOUT);
				connection.setReadTimeout(TIMEOUT);

				int status = connection.getResponseCode();

				if (status < RANGE) {
					reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
					while ((line = reader.readLine()) != null) {
						responseContent.append(line);
					}
					reader.close();
				}

				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				String json = responseContent.toString();
				BaseCountries[] country = objectMapper.readValue(json, BaseCountries[].class);

				objectMapper.writeValue(new File("target/NewCountry.json"), country);
				System.out.println("NewCountry.json is completely created.");

				File currDir = new File(".");
				String path = currDir.getAbsolutePath();
				String fileLocation = path.substring(0, path.length() - 1) + "Countries.xls";

				WritableWorkbook workbook = Workbook.createWorkbook(new File(fileLocation));
				WritableSheet sheet = workbook.createSheet("Sheet 1", 0);

				WritableCellFormat headerFormat = new WritableCellFormat();

				Label headerLabel = new Label(0, 0, "Name of country", headerFormat);
				sheet.setColumnView(0, 60);
				sheet.addCell(headerLabel);
				WritableCellFormat cellFormat = new WritableCellFormat();
				cellFormat.setWrap(true);

				for (int i = 0; i < country.length; i++) {
				Label cellLabel = new Label(0, i + 2, country[i].getName().getCommon(), cellFormat);
				sheet.addCell(cellLabel);
				}

				workbook.write();
				workbook.close();
				System.out.println("Countries.xls is completely created.");

			} catch (MalformedURLException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
	}
}

