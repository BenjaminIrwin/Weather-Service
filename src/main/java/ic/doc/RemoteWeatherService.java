package ic.doc;

import com.weather.Day;
import com.weather.Forecast;
import com.weather.Forecaster;
import com.weather.Region;

public class RemoteWeatherService implements WeatherService {

  @Override
  public String request(String weatherSearch) {
    return "HELLO";
  }

}
