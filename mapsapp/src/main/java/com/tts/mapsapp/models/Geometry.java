package com.tts.mapsapp.models;

public class Geometry {

 private Location location;

	public Geometry() {
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Geometry [location=" + location + "]";
	}

 
	
}
