package launcher.Weather;

public class WeatherProvider {
    private WeatherProvider() {
        System.out.println("Weather Provider Singleton Created");
    }
    // Helper Nested Class to Ensure the Singleton
    private static class SingletonHelper {
        private static final String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};
    }
    public String getCurrentWeather() {
        // TODO:  Pass a Coordinates Object and return a string with the weather for that
        // TODO:  Coords
        return SingletonHelper.weather[2 /*TODO REPLACE*/];
    }
}
