package dtos;

import java.util.List;

import lombok.Data;

@Data 
public class Idd {
	
	private	String root;
	
	private List<String> suffixes;
}
