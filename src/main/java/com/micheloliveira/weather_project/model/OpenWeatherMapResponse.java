package com.micheloliveira.weather_project.model;

public class OpenWeatherMapResponse {
    private String name;
    private Main main;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public static class Main {
        private double temperatura;

        public double getTemp() {
            return temperatura;
        }

        public void setTemp(double temperatura) {
            this.temperatura = temperatura;
        }
    }
}

