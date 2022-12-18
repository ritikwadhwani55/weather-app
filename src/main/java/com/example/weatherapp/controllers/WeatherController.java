package com.example.weatherapp.controllers;

import java.net.http.HttpResponse;
import java.util.Arrays;

import org.apache.catalina.connector.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.weatherapp.models.Coord;
import com.example.weatherapp.models.WeatherData;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class WeatherController 
{
	RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/weather/{city}")
	public String getWeatherData(@PathVariable("city") String city, Model model) throws JsonMappingException, JsonProcessingException {
		String api_key = "0fad7842cd7c78697f965ee0e484ba8a";
			    
//		base_url variable to store url
		String base_url = "http://api.openweathermap.org/data/2.5/weather?";
		String complete_url = base_url + "appid=" + api_key + "&q=" + city;
		ResponseEntity<WeatherData> response
		  = restTemplate.getForEntity(complete_url , WeatherData.class);
		model.addAttribute("weatherInfo", response.getBody());
		model.addAttribute("main", response.getBody().getMain());
		model.addAttribute("kToC", String.format("%.2f",response.getBody().getMain().getTemp()-273.15));
		return "index";

	}
	@GetMapping("/football")
	public void getFootballData(Model model) {
		String base_url = "https://crypto-news-live3.p.rapidapi.com/news";
		String api_key = "e5c4da3d27msh48433b932817774p1a2617jsn1e526b31d207";
		HttpHeaders headers = new HttpHeaders();
		
		
		RestTemplate restTemplate = new RestTemplate();

		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("X-RapidAPI-Key", "e5c4da3d27msh48433b932817774p1a2617jsn1e526b31d207");
		headers.set("X-RapidAPI-Host", "crypto-news-live3.p.rapidapi.com");

		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		ResponseEntity<Object> respEntity = restTemplate.exchange(base_url, HttpMethod.GET, entity, Object.class);

		Object response = respEntity.getBody();
		
//		HttpEntity<String> entity = new HttpEntity<>("body", headers);
//		ResponseEntity<Object> response
//		  = restTemplate.execute(base_url ,HttpMethod.GET,entity, Object.class);
		System.out.println(respEntity.getBody());
	}
	
//	http://api.openweathermap.org/data/2.5/air_pollution?lat={lat}&lon={lon}&appid={API key}
	@GetMapping("/pollution/{city}")
	public void getAirPollutionData(@PathVariable("city") String city, Model model) throws JsonMappingException, JsonProcessingException {
		String api_key = "0fad7842cd7c78697f965ee0e484ba8a";
			    
//		base_url variable to store url
		String base_url = "http://api.openweathermap.org/data/2.5/air_pollution?";
		String complete_url = base_url + "appid=" + api_key + "&q=" + city;
		ResponseEntity<Object> response
		  = restTemplate.getForEntity(complete_url , Object.class);
//		model.addAttribute("weatherInfo", response.getBody());
//		model.addAttribute("main", response.getBody().getMain());
//		model.addAttribute("kToC", String.format("%.2f",response.getBody().getMain().getTemp()-273.15));
		System.out.print(response);

	}
	
	@GetMapping("/cord/{city}")
	public void getLatLongData(@PathVariable("city") String city, Model model) throws JsonMappingException, JsonProcessingException, NoSuchFieldException, SecurityException {
		String api_key = "0fad7842cd7c78697f965ee0e484ba8a";
			    
//		base_url variable to store url
		String base_url = "http://api.openweathermap.org/geo/1.0/direct?";
		String complete_url = base_url + "q=" + city + "&limit=1&appid=" + api_key;
		ResponseEntity<Coord[]> response
		  = restTemplate.getForEntity(complete_url , Coord[].class);
//		model.addAttribute("weatherInfo", response.getBody());
//		model.addAttribute("main", response.getBody().getMain());
//		model.addAttribute("kToC", String.format("%.2f",response.getBody().getMain().getTemp()-273.15));
		System.out.print(response.getBody()[0].getState());

	}

}
