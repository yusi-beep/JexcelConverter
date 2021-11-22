package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

public class HttpRequest {

	private static HttpURLConnection connection;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader;
		String line;
		StringBuilder responseContent = new StringBuilder();

		// Method 1: java.net.HttpURLConection
		try {
			URL url = new URL("https://restcountries.com/v3.1/all");
			connection = (HttpURLConnection) url.openConnection();

			// Request setup
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);

			int status = connection.getResponseCode();
			 //System.out.println(status);

			if (status > 299) {
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
				while ((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			}
			else {
				reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while ((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
				
			}
			System.out.println(responseContent.toString());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

