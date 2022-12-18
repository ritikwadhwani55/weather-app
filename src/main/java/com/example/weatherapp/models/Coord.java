package com.example.weatherapp.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Coord {
	@JsonProperty("name")
	private String name;
	@JsonProperty("local_names")
	private Object local_names;
	@JsonProperty("lat")
	private Double lat;
	@JsonProperty("lon")
	private Double lon;
	@JsonProperty("country")
	private String country;
	@JsonProperty("state")
	private String state;
	@JsonGetter("name")
	public String getName() {
		return name;
	}
	@JsonSetter("name")
	public void setName(String name) {
		this.name = name;
	}
	@JsonGetter("local_names")
	public Object getLocal_names() {
		return local_names;
	}
	@JsonSetter("local_names")
	public void setLocal_names(Object local_names) {
		this.local_names = local_names;
	}
	@JsonGetter("lat")
	public Double getLat() {
		return lat;
	}
	@JsonSetter("lat")
	public void setLat(Double lat) {
		this.lat = lat;
	}
	@JsonGetter("lon")
	public Double getLon() {
		return lon;
	}
	@JsonSetter("lon")
	public void setLon(Double lon) {
		this.lon = lon;
	}
	@JsonGetter("country")
	public String getCountry() {
		return country;
	}
	@JsonSetter("country")
	public void setCountry(String country) {
		this.country = country;
	}
	@JsonGetter("state")
	public String getState() {
		return state;
	}
	@JsonSetter("state")
	public void setState(String state) {
		this.state = state;
	}
	public Coord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coord(String name, Object local_names, Double lat, Double lon, String country, String state) {
		super();
		this.name = name;
		this.local_names = local_names;
		this.lat = lat;
		this.lon = lon;
		this.country = country;
		this.state = state;
	}

	
	
	
	
}
