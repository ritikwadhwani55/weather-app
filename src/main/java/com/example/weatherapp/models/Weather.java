package com.example.weatherapp.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Weather implements Serializable{
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("main")
	private String main;
	@JsonProperty("description")
	private String description;
	@JsonProperty("icon")
	private String icon;
	
	@JsonGetter("id")
	public Integer getId() {
		return id;
	}
	@JsonSetter("id")
	public void setId(Integer id) {
		this.id = id;
	}
	@JsonGetter("main")
	public String getMain() {
		return main;
	}
	@JsonSetter("main")
	public void setMain(String main) {
		this.main = main;
	}
	@JsonGetter("description")
	public String getDescription() {
		return description;
	}
	@JsonSetter("description")
	public void setDescription(String description) {
		this.description = description;
	}
	@JsonGetter("icon")
	public String getIcon() {
		return icon;
	}
	@JsonSetter("icon")
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Weather(Integer id, String main, String description, String icon) {
		super();
		this.id = id;
		this.main = main;
		this.description = description;
		this.icon = icon;
	}
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
