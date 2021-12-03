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

public class HttpRequest {

	public static void main(String[] args) {

		BufferedReader reader;
		String line;
		StringBuilder responseContent = new StringBuilder();

		try {
			URL url = new URL("https://restcountries.com/v3.1/all");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);

			int status = connection.getResponseCode();
			// System.out.println(status);

			if (status < 299) {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while ((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			}
/*			
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			String json=responseContent.toString();
			BaseCountries[] name = objectMapper.readValue(json, BaseCountries[].class);

			objectMapper.writeValue(new File("target/NewCountry.json"), name);
			System.out.print("NewCountry.json is completely created.");
*/
			//System.out.println(responseContent.toString());

		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
