package ic.doc;

import com.weather.Day;
import com.weather.Forecast;
import com.weather.Forecaster;
import com.weather.Region;

public class WeatherClient {

  WeatherService WeatherService;

  public WeatherClient(WeatherService service) {
    this.WeatherService = service;
  }

  public void weatherSearch(String weatherSearch) {
    WeatherService.request(weatherSearch);
  }

  public static void main(String[] args) {

    // This is just an example of using the 3rd party API - delete this class before submission.

  }
}
