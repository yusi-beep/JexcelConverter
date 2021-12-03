package main;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import dtos.BaseCountries;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class JsonToJavaObject {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException, RowsExceededException, WriteException {

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		BaseCountries[] name = objectMapper.readValue(new File("src/main/java/main/Country.json"), BaseCountries[].class);

		objectMapper.writeValue(new File("target/NewCountry.json"), name);
		System.out.print("NewCountry.json is completely created.");
		
	}

}
