package com.tts.transitapp.model;

public class Element {

	public Distance distance;
	public Duration duration;
	public String status;

	public Element() {
	}

	public Distance getDistance() {
		return distance;
	}

	public void setDistance(Distance distance) {
		this.distance = distance;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Element [distance=" + distance + ", duration=" + duration + ", status=" + status + "]";
	}

	
	

}
