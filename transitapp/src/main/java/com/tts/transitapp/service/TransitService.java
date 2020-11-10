package com.tts.transitapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tts.transitapp.model.Bus;
import com.tts.transitapp.model.BusComparator;
import com.tts.transitapp.model.BusRequest;
import com.tts.transitapp.model.DistanceResponse;
import com.tts.transitapp.model.GeocodingResponse;
import com.tts.transitapp.model.Location;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TransitService {

	@Value("${transit_url}")
	public String transitUrl;

	@Value("${geocoding_url}")
	public String geocodingUrl;

	@Value("${distance_url}")
	public String distanceUrl;

	@Value("${api_key}")
	public String googleApiKey;

	private List<Bus> getBuses() {

		RestTemplate restTemplate = new RestTemplate();

		Bus[] buses = restTemplate.getForObject(transitUrl, Bus[].class);

		return Arrays.asList(buses);
	}

	private Location getCoordinates(String description) {

		description = description.replace(" ", "+");
		String url = geocodingUrl + description + "GA&key=" + googleApiKey;
		RestTemplate restTemplate = new RestTemplate();
		GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);

		return response.results.get(0).geometry.location;
	}

	private double getDistance(Location origin, Location destination) {

		String url = distanceUrl + "origins=" + origin.lat + "," + origin.lng + "&destinations=" + destination.lat + ","
				+ destination.lng + "&key=" + googleApiKey;

		System.out.println("\nGet distance formatted URL: " + url);

		RestTemplate restTemplate = new RestTemplate();

		DistanceResponse response = restTemplate.getForObject(url, DistanceResponse.class);

		System.out.println("Response from distance matrix: " + response);

		return (response.rows.get(0).elements.get(0).distance.value) * 0.000621371;
	}

	public List<Bus> getNearbyBuses(BusRequest request) {
		// Declaring some variables
		// This allBuses variable, is the list of all the buses we get back from the
		// getBuses method above
		List<Bus> allBuses = this.getBuses();

		Location personLocation = this.getCoordinates(request.address + " " + request.city);

		System.out.println(personLocation);

		List<Bus> nearbyBuses = new ArrayList<>();

		for (Bus bus : allBuses) {
			Location busLocation = new Location();
			busLocation.lat = bus.LATITUDE;
			busLocation.lng = bus.LONGITUDE;

			double latDistance = Double.parseDouble(busLocation.lat) - Double.parseDouble(personLocation.lat);
			double lngDistance = Double.parseDouble(busLocation.lng) - Double.parseDouble(personLocation.lng);

			if (Math.abs(latDistance) <= 0.02 && Math.abs(lngDistance) <= 0.02) {
				double distance = getDistance(busLocation, personLocation);
				if (distance <= 1) {
					bus.distance = (double) Math.round(distance * 100) / 100;
					nearbyBuses.add(bus);
				}
			}
		}

		Collections.sort(nearbyBuses, new BusComparator());
		return nearbyBuses;

	}

	public void run() {

	}

}
