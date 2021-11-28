package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;




public class HttpRequest {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//BufferedReader reader;
		//String line;
		//StringBuilder responseContent = new StringBuilder();

		// Method 1: java.net.HttpURLConection
		/*try {
			URL url = new URL("https://restcountries.com/v3.1/all");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

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
			//jsonObject(responseContent);					//function
			//System.out.println(responseContent.toString());
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}*/
			
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				BaseCountries[] name = objectMapper.readValue(new File("src/main/Country.json"), BaseCountries[].class);
				objectMapper.writeValue(new File("target/NewCountry.json"), name);
	}
}

