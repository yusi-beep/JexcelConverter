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
import com.fasterxml.jackson.databind.ObjectMapper;




public class HttpRequest {

	

	public static void main(String[] args) {
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
		
		String jsonAsString="[\r\n"
				+ "  {\r\n"
				+ "    \"name\": {\r\n"
				+ "      \"common\": \"Japan\",\r\n"
				+ "      \"official\": \"Japan\",\r\n"
				+ "      \"nativeName\": {\r\n"
				+ "        \"jpn\": {\r\n"
				+ "          \"official\": \"日本\",\r\n"
				+ "          \"common\": \"日本\"\r\n"
				+ "        }\r\n"
				+ "      }\r\n"
				+ "    },\r\n"
				+ "    \"tld\": [\r\n"
				+ "      \".jp\",\r\n"
				+ "      \".みんな\"\r\n"
				+ "    ],\r\n"
				+ "    \"cca2\": \"JP\",\r\n"
				+ "    \"ccn3\": \"392\",\r\n"
				+ "    \"cca3\": \"JPN\",\r\n"
				+ "    \"cioc\": \"JPN\",\r\n"
				+ "    \"independent\": true,\r\n"
				+ "    \"status\": \"officially-assigned\",\r\n"
				+ "    \"unMember\": true,\r\n"
				+ "    \"currencies\": {\r\n"
				+ "      \"JPY\": {\r\n"
				+ "        \"name\": \"Japanese yen\",\r\n"
				+ "        \"symbol\": \"¥\"\r\n"
				+ "      }\r\n"
				+ "    },\r\n"
				+ "    \"idd\": {\r\n"
				+ "      \"root\": \"+8\",\r\n"
				+ "      \"suffixes\": [\r\n"
				+ "        \"1\"\r\n"
				+ "      ]\r\n"
				+ "    },\r\n"
				+ "    \"capital\": [\r\n"
				+ "      \"Tokyo\"\r\n"
				+ "    ],\r\n"
				+ "    \"altSpellings\": [\r\n"
				+ "      \"JP\",\r\n"
				+ "      \"Nippon\",\r\n"
				+ "      \"Nihon\"\r\n"
				+ "    ],\r\n"
				+ "    \"region\": \"Asia\",\r\n"
				+ "    \"subregion\": \"Eastern Asia\",\r\n"
				+ "    \"languages\": {\r\n"
				+ "      \"jpn\": \"Japanese\"\r\n"
				+ "    },\r\n"
				+ "    \"translations\": {\r\n"
				+ "      \"ces\": {\r\n"
				+ "        \"official\": \"Japonsko\",\r\n"
				+ "        \"common\": \"Japonsko\"\r\n"
				+ "      },\r\n"
				+ "      \"deu\": {\r\n"
				+ "        \"official\": \"Japan\",\r\n"
				+ "        \"common\": \"Japan\"\r\n"
				+ "      },\r\n"
				+ "      \"est\": {\r\n"
				+ "        \"official\": \"Jaapan\",\r\n"
				+ "        \"common\": \"Jaapan\"\r\n"
				+ "      },\r\n"
				+ "      \"fin\": {\r\n"
				+ "        \"official\": \"Japani\",\r\n"
				+ "        \"common\": \"Japani\"\r\n"
				+ "      },\r\n"
				+ "      \"fra\": {\r\n"
				+ "        \"official\": \"Japon\",\r\n"
				+ "        \"common\": \"Japon\"\r\n"
				+ "      },\r\n"
				+ "      \"hrv\": {\r\n"
				+ "        \"official\": \"Japan\",\r\n"
				+ "        \"common\": \"Japan\"\r\n"
				+ "      },\r\n"
				+ "      \"hun\": {\r\n"
				+ "        \"official\": \"Japán\",\r\n"
				+ "        \"common\": \"Japán\"\r\n"
				+ "      },\r\n"
				+ "      \"ita\": {\r\n"
				+ "        \"official\": \"Giappone\",\r\n"
				+ "        \"common\": \"Giappone\"\r\n"
				+ "      },\r\n"
				+ "      \"jpn\": {\r\n"
				+ "        \"official\": \"日本\",\r\n"
				+ "        \"common\": \"日本\"\r\n"
				+ "      },\r\n"
				+ "      \"kor\": {\r\n"
				+ "        \"official\": \"일본국\",\r\n"
				+ "        \"common\": \"일본\"\r\n"
				+ "      },\r\n"
				+ "      \"nld\": {\r\n"
				+ "        \"official\": \"Japan\",\r\n"
				+ "        \"common\": \"Japan\"\r\n"
				+ "      },\r\n"
				+ "      \"per\": {\r\n"
				+ "        \"official\": \"ژاپن\",\r\n"
				+ "        \"common\": \"ژاپن\"\r\n"
				+ "      },\r\n"
				+ "      \"pol\": {\r\n"
				+ "        \"official\": \"Japonia\",\r\n"
				+ "        \"common\": \"Japonia\"\r\n"
				+ "      },\r\n"
				+ "      \"por\": {\r\n"
				+ "        \"official\": \"Japão\",\r\n"
				+ "        \"common\": \"Japão\"\r\n"
				+ "      },\r\n"
				+ "      \"rus\": {\r\n"
				+ "        \"official\": \"Япония\",\r\n"
				+ "        \"common\": \"Япония\"\r\n"
				+ "      },\r\n"
				+ "      \"slk\": {\r\n"
				+ "        \"official\": \"Japonsko\",\r\n"
				+ "        \"common\": \"Japonsko\"\r\n"
				+ "      },\r\n"
				+ "      \"spa\": {\r\n"
				+ "        \"official\": \"Japón\",\r\n"
				+ "        \"common\": \"Japón\"\r\n"
				+ "      },\r\n"
				+ "      \"swe\": {\r\n"
				+ "        \"official\": \"Japan\",\r\n"
				+ "        \"common\": \"Japan\"\r\n"
				+ "      },\r\n"
				+ "      \"urd\": {\r\n"
				+ "        \"official\": \"جاپان\",\r\n"
				+ "        \"common\": \"جاپان\"\r\n"
				+ "      },\r\n"
				+ "      \"zho\": {\r\n"
				+ "        \"official\": \"日本国\",\r\n"
				+ "        \"common\": \"日本\"\r\n"
				+ "      }\r\n"
				+ "    },\r\n"
				+ "    \"latlng\": [\r\n"
				+ "      36.0,\r\n"
				+ "      138.0\r\n"
				+ "    ],\r\n"
				+ "    \"landlocked\": false,\r\n"
				+ "    \"area\": 377930.0,\r\n"
				+ "    \"flag\": \"🇯🇵\",\r\n"
				+ "    \"flags\": [\r\n"
				+ "      \"svg\": \"https://restcountries.com/data/jpn.svg\",\r\n"
				+ "      \"png\": \"https://restcountries.com/data/png/jpn.png\"\r\n"
				+ "    ],\r\n"
				+ "    \"demonyms\": {\r\n"
				+ "      \"eng\": {\r\n"
				+ "        \"f\": \"Japanese\",\r\n"
				+ "        \"m\": \"Japanese\"\r\n"
				+ "      },\r\n"
				+ "      \"fra\": {\r\n"
				+ "        \"f\": \"Japonaise\",\r\n"
				+ "        \"m\": \"Japonais\"\r\n"
				+ "      }\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "]";
				ObjectMapper objectMapper = new ObjectMapper();
				objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
				try {
					Collection<BaseCountries> readValues = new ObjectMapper().readValue(
						    jsonAsString, new TypeReference<Collection<BaseCountries>>() { }
						);
				} catch (JsonProcessingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	

}

