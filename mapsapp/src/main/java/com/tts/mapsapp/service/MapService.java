package com.tts.mapsapp.service;

import com.tts.mapsapp.models.GeocodingResponse;
import com.tts.mapsapp.models.Location;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MapService {

	@Value("${api_key}")
	private String apiKey;

	public void addCoordinates(Location location) {
		String url = "https://maps.googleapis.com/maps/api/geocode/json?address=" + location.getCity() + ","
				+ location.getState() + "&key=" + apiKey;

		RestTemplate restTemplate = new RestTemplate();
		GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
		Location coordinates = response.getResults().get(0).getGeometry().getLocation();

		location.setLat(coordinates.getLat());
		location.setLng(coordinates.getLng());

	}

	public void getRandomLocation(Location location) {
		double minLat = 25.8419;
    double maxLat = 36.5008;
    double minLng = -106.6168;
		double maxLng = -93.5074;

		String randomLat = String.valueOf((double)(Math.random() * (maxLat - minLat) + minLat));
		String randomLng = String.valueOf((double)(Math.random() * (maxLng - minLng) + minLng));

		location.setLat(randomLat);
		location.setLng(randomLng);
		

	}

	// public Location randomCity() {
	// return null;
	// }

}
