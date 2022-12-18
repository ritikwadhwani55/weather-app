package com.example.weatherapp.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Main implements Serializable {
	@JsonProperty("temp")
	private Double temp;
	@JsonProperty("feels_like")
	private Double feels_like;
	@JsonProperty("temp_min")
	private Double temp_min;
	@JsonProperty("temp_max")
	private Double temp_max;
	@JsonProperty("pressure")
	private Integer pressure;
	@JsonProperty("humidity")
	private Integer humidity;
	public Main(Double temp, Double feels_like, Double temp_min, Double temp_max, Integer pressure, Integer humidity) {
		super();
		this.temp = temp;
		this.feels_like = feels_like;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.pressure = pressure;
		this.humidity = humidity;
	}
	
	public Double getTemp() {
		return temp;
	}
	
	public void setTemp(Double temp) {
		this.temp = temp;
	}
	
	public Double getFeels_like() {
		return feels_like;
	}
	
	public void setFeels_like(Double feels_like) {
		this.feels_like = feels_like;
	}
	
	public Double getTemp_min() {
		return temp_min;
	}
	
	public void setTemp_min(Double temp_min) {
		this.temp_min = temp_min;
	}
	
	public Double getTemp_max() {
		return temp_max;
	}
	
	public void setTemp_max(Double temp_max) {
		this.temp_max = temp_max;
	}
	
	public Integer getPressure() {
		return pressure;
	}
	
	public void setPressure(Integer pressure) {
		this.pressure = pressure;
	}
	
	public Integer getHumidity() {
		return humidity;
	}
	
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
