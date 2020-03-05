package ic.doc;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CachingProxy implements WeatherService {

  WeatherService remoteService;
  HashMap<String, String> cache;

  public CachingProxy(WeatherService remoteService) {
    this.remoteService = remoteService;
    cache = new HashMap<String, String>();
  }

  @Override
  public String request(String weatherSearch) {

    String result = cache.get(weatherSearch);
    if(result == null) {
      result = remoteService.request(weatherSearch);
      cache.put(weatherSearch, result);
    }

    return result;
  };
}
