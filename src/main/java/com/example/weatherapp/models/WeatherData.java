package com.example.weatherapp.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class WeatherData implements Serializable{
	@JsonProperty("weather")
	private List<Weather> weather;
	@JsonProperty("main")
	private Main main;
	@JsonProperty("name")
	private String name;
	@JsonGetter("weather")
	public List<Weather> getWeather() {
		return weather;
	}
	@JsonSetter("weather")
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	@JsonGetter("main")
	public Main getMain() {
		return main;
	}
	@JsonSetter("main")
	public void setMain(Main main) {
		this.main = main;
	}
	@JsonGetter("name")
	public String getName() {
		return name;
	}
	@JsonSetter("name")
	public void setName(String name) {
		this.name = name;
	}
	public WeatherData(List<Weather> weather, Main main, String name) {
		super();
		this.weather = weather;
		this.main = main;
		this.name = name;
	}
	public WeatherData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
