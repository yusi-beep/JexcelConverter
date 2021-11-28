package main;

import java.util.List;

public class BaseCountries  {
	private Name name;
	private List<String> tld;
	private String cca2;
	private String ccn3;
	private String cca3;
	private String cioc;
	private boolean independent;
	private String status;
	private boolean unMember;
	private List<NativeName> curencies;
	private Idd idd;
	private String capital;
	private List<String> altSpelling;
	private String region;
	private String subregion;
	private List<Language> languages;
	private List<Translations> translations;
	private List<Double> latlng;
	private boolean landlocked;
	private double area;
	private String flag;
	private List<String> flags;
	private NativeName demonyms;
	
	public BaseCountries() {
	}
	
	public List<String> getAltSpelling() {
		return altSpelling;
	}
	
	public double getArea() {
		return area;
	}
	public String getCapital() {
		return capital;
	}
	
	public String getCca2() {
		return cca2;
	}
	
	public String getCca3() {
		return cca3;
	}
	
	public String getCcn3() {
		return ccn3;
	}
	
	public String getCioc() {
		return cioc;
	}
	
	public List<NativeName> getCurencies() {
		return curencies;
	}
	
	public NativeName getDemonyms() {
		return demonyms;
	}
	
	public String getFlag() {
		return flag;
	}
	
	public List<String> getFlags() {
		return flags;
	}
	
	public Idd getIdd() {
		return idd;
	}
	
	public List<Language> getLanguages() {
		return languages;
	}
	
	public Name getName() {
		return name;
	}
	
	public List<Double> getLatlng() {
		return latlng;
	}
	
	public String getRegion() {
		return region;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getSubregion() {
		return subregion;
	}
	
	 public List<String> getTld() {
		return tld;
	}
	 
	 public List<Translations> getTranslations() {
		return translations;
	}
	 
	public boolean isIndependent() {
		return independent;
	}
	
	public boolean isLandlocked() {
		return landlocked;
	}
	
	public boolean isUnMember() {
		return unMember;
	}
	
	public void setAltSpelling(List<String> altSpelling) {
		this.altSpelling = altSpelling;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public void setCca2(String cca2) {
		this.cca2 = cca2;
	}
	
	public void setCca3(String cca3) {
		this.cca3 = cca3;
	}
	
	public void setCcn3(String ccn3) {
		this.ccn3 = ccn3;
	}
	
	public void setCioc(String cioc) {
		this.cioc = cioc;
	}
	
	public void setCurencies(List<NativeName> curencies) {
		this.curencies = curencies;
	}
	
	public void setDemonyms(NativeName demonyms) {
		this.demonyms = demonyms;
	}
	
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public void setFlags(List<String> flags) {
		this.flags = flags;
	}
	
	public void setIdd(Idd idd) {
		this.idd = idd;
	}
	
	public void setLandlocked(boolean landlocked) {
		this.landlocked = landlocked;
	}
	
	public void setIndependent(boolean independent) {
		this.independent = independent;
	}
	
	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}
	
	public void setLatlng(List<Double> latlng) {
		this.latlng = latlng;
	}
	
	public void setName(Name name) {
		this.name = name;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	
	public void setTld(List<String> tld) {
		this.tld = tld;
	}
	
	public void setTranslations(List<Translations> translations) {
		this.translations = translations;
	}
	
	public void setUnMember(boolean unMember) {
		this.unMember = unMember;
	}
}
