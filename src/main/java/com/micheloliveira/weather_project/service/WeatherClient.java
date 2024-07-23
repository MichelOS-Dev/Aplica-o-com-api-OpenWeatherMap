package com.micheloliveira.weather_project.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.micheloliveira.weather_project.model.OpenWeatherMapResponse;

@FeignClient(name = "weatherClient", url="http://api.openweathermap.org/data/2.5")
public interface WeatherClient {
    
    @GetMapping("/weather")
    OpenWeatherMapResponse getWeather(@RequestParam("q") String cidade, @RequestParam("appid") String API_KEY);

}
