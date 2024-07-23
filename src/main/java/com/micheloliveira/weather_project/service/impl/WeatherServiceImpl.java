package com.micheloliveira.weather_project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.micheloliveira.weather_project.model.OpenWeatherMapResponse;
import com.micheloliveira.weather_project.model.WeatherResponse;
import com.micheloliveira.weather_project.service.WeatherClient;
import com.micheloliveira.weather_project.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

    @Autowired
    private WeatherClient weatherClient;

    @Value("${openweathermap.api.key}")
    private String apiKey;

    public WeatherResponse getWeather(String cidade){
        OpenWeatherMapResponse apiResponse = weatherClient.getWeather(cidade, apiKey);
        WeatherResponse response = new WeatherResponse();
        response.setNomeCidade(apiResponse.getName());
        response.setTemperatura(convertKelvinToCelsius(apiResponse.getMain().getTemp()));
        return response;
    }

    private double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
