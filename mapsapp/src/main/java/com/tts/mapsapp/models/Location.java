package com.tts.mapsapp.models;

public class Location {

	private String city;
	private String state;
	private String lat;
	private String lng;

	public Location() {
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", lat=" + lat + ", lng=" + lng + ", state=" + state + "]";
	}

	
	


}
