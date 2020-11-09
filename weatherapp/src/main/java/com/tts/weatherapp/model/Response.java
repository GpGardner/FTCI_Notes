package com.tts.weatherapp.model;

import java.util.List;
import java.util.Map;

public class Response {

	// fields, properties, instance variables

	private Map<String, String> coord;
	private List<Map<String, String>> weather;
	private String base;
	private Map<String, String> main;
	private Map<String, String> wind;
	private Map<String, String> clouds;
	private String dt;
	private Map<String, String> sys;
	private String id;
	private String name;
	private String cod;

	// Constructor

	public Response() {
	}

	public Map<String, String> getCoord() {
		return coord;
	}

	public void setCoord(Map<String, String> coord) {
		this.coord = coord;
	}

	public List<Map<String, String>> getWeather() {
		return weather;
	}

	public void setWeather(List<Map<String, String>> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Map<String, String> getMain() {
		return main;
	}

	public void setMain(Map<String, String> main) {
		this.main = main;
	}

	public Map<String, String> getWind() {
		return wind;
	}

	public void setWind(Map<String, String> wind) {
		this.wind = wind;
	}

	public Map<String, String> getClouds() {
		return clouds;
	}

	public void setClouds(Map<String, String> clouds) {
		this.clouds = clouds;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public Map<String, String> getSys() {
		return sys;
	}

	public void setSys(Map<String, String> sys) {
		this.sys = sys;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	@Override
	public String toString() {
		return "Response [base=" + base + ", clouds=" + clouds + ", cod=" + cod + ", coord=" + coord + ", dt=" + dt
				+ ", id=" + id + ", main=" + main + ", name=" + name + ", sys=" + sys + ", weather=" + weather + ", wind="
				+ wind + "]";
	}

}
