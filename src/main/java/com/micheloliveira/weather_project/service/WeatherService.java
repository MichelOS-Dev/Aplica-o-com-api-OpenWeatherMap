package com.micheloliveira.weather_project.service;

import com.micheloliveira.weather_project.model.WeatherResponse;

public interface WeatherService {
      /**
     * Obtém a previsão do tempo para uma cidade específica.
     * 
     * @param cidade o nome da cidade para a qual obter a previsão
     * @return um objeto WeatherResponse contendo os dados da previsão
     */
    WeatherResponse getWeather(String cidade);
}
