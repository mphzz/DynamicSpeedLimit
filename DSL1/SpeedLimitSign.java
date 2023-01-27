import java.util.HashMap;
import java.util.Map;

public class SpeedLimitSign {
    private int currentSpeedLimit;
    private Map<String, Integer> weatherSpeedLimits;
    private Map<String, Integer> trafficSpeedLimits;

    public SpeedLimitSign() {
        currentSpeedLimit = 55;
        weatherSpeedLimits = new HashMap<String, Integer>();
        weatherSpeedLimits.put("sunny", 55);
        weatherSpeedLimits.put("rainy", 50);
        weatherSpeedLimits.put("snowy", 45);
        //Need weather data
        trafficSpeedLimits = new HashMap<String, Integer>();
        trafficSpeedLimits.put("light", 55);
        trafficSpeedLimits.put("medium", 50);
        trafficSpeedLimits.put("heavy", 45);
        //Need traffic data
    }

    public void updateSpeedLimit(String weather, String traffic) {
        int weatherSpeedLimit = weatherSpeedLimits.get(weather);
        int trafficSpeedLimit = trafficSpeedLimits.get(traffic);
        currentSpeedLimit = Math.min(weatherSpeedLimit, trafficSpeedLimit);
        //Take lowest speed
    }

    public int getCurrentSpeedLimit() {
        return currentSpeedLimit;
    }
}