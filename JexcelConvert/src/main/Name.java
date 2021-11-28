package main;

import name.*;

public class Name  {
	private String official;
	private String common;
	public NativeName nativeName;
	
	public String getCommon() {
		return common;
	}
	
	public NativeName getNativeName() {
		return nativeName;
	}
	
	public String getOfficial() {
		return official;
	}
	
	public void setCommon(String common) {
		this.common = common;
	}
	
	public void setNativeName(NativeName nativeName) {
		this.nativeName = nativeName;
	}
	
	public void setOfficial(String official) {
		this.official = official;
	}
}
