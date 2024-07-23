package com.micheloliveira.weather_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.micheloliveira.weather_project.model.WeatherResponse;
import com.micheloliveira.weather_project.service.impl.WeatherServiceImpl;;

@RestController
public class WeatherController {

    @Autowired
    private WeatherServiceImpl weatherService;

    @GetMapping("/weather")
    public WeatherResponse getWeather(@RequestParam("cidade") String cidade) {
        return weatherService.getWeather(cidade);
    }
}
