package model;

import java.io.Serializable;
import java.util.List;

// https://github.com/robertoduessmann/weather-api
public class CityData implements Serializable {

    private String temperature;

    private String wind;

    private String description;

    private List<Daily> forecast;

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Daily> getForecast() {
        return forecast;
    }

    public void setForecast(List<Daily> forecast) {
        this.forecast = forecast;
    }

    @Override
    public String toString() {
        return "CityData{" +
                "temperature='" + temperature + '\'' +
                ", wind='" + wind + '\'' +
                ", description='" + description + '\'' +
                ", forecast=" + forecast +
                '}';
    }
}
