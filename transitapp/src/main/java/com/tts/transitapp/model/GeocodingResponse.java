package com.tts.transitapp.model;

import java.util.List;

public class GeocodingResponse {
	
	public List<Geocoding> results;

	public GeocodingResponse() {
	}

	public List<Geocoding> getResults() {
		return results;
	}

	public void setResults(List<Geocoding> results) {
		this.results = results;
	}

	@Override
	public String toString() {
		return "GeocodingResponse [results=" + results + "]";
	}

	

}
