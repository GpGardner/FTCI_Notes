package com.tts.weatherapp.model;

public class Request {

	private String zipCode;

	public Request() {

	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Request [zipCode=" + zipCode + "]";
	}

}
