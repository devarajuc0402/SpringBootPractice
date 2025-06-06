package com.springboot.practice.response;

public class CustomResponse {

	private String reponseName;
	private String payload;
	
	public String getReponseName() {
		return reponseName;
	}
	public void setReponseName(String reponseName) {
		this.reponseName = reponseName;
	}
	public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		return "CustomResponse [reponseName=" + reponseName + ", payload=" + payload + "]";
	}
	
}
