package dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseCountries {
	private Name name;
	private List<String> tld;
	private String cca2;
	private String ccn3;
	private String cca3;
	private String cioc;
	private boolean independent;
	private String status;
	private boolean unMember;
	private Currencies currencies;
	private Idd idd;
	private List<String> capital;
	private List<String> altSpellings;
	private String region;
	private String subregion;
	private Language languages;
	private Translations translations;
	private List<Double> latlng;
	private boolean landlocked;
	private double area;
	private String flag;
	private Flag flags;
	private Demonyms demonyms;
}
