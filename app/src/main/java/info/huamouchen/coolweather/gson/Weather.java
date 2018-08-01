package info.huamouchen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;

    public Basic basic;

    public CityUpdate update;

    @SerializedName("daily_forecast")
    public List<DailyForecast> forecastList;

    public Now now;

    public Aqi aqi;

    public Lifestyle lifestyle;

}
