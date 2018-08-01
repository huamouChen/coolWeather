package info.huamouchen.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class DailyForecast {

    @SerializedName("date")
    public String date_my;

    public String cond_txt_d;

    public String tmp_max;

    public String tmp_min;


}
