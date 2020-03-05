package ic.doc;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class CachingProxyTests {

  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();

  WeatherService onlineWeather = context.mock(WeatherService.class);

  @Test
  public void cacheTest() {

    CachingProxy weatherCachingProxy = new CachingProxy(onlineWeather);
    String weatherSearch = "LondonSummary";

    context.checking(new Expectations() {{
     exactly(1).of(onlineWeather).request(weatherSearch);
    }});

    weatherCachingProxy.request(weatherSearch);
    weatherCachingProxy.request(weatherSearch);
  }
}
