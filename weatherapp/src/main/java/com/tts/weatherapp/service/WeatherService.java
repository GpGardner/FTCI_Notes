package com.tts.weatherapp.service;

import com.tts.weatherapp.model.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	
	@Value("${api_key}")
	private String apiKey;

	
	//MAKE A CALL TO OPENWEATHER API, WITH DYNAMIC ZIPCODE AND APIKEY
	public Response getForecast(String zipCode){
		String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + "&appid=" + apiKey;
		RestTemplate restTemplate = new RestTemplate();
		
		//MAKE A CALL TO "URL"
		//SHOVE THE RESPONSE IN A RESPONSE "OBJECT"
		try{
			return restTemplate.getForObject(url, Response.class);
		}catch(HttpClientErrorException exception){
			Response response = new Response();
			response.setName("ERROR");
			return response;
		}
	}

}
