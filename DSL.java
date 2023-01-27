/*

ORIGINAL PROTO CODE

PLEASE

IGNORE

*/
import java.util.Timer;
import java.util.TimerTask;
/*

ORIGINAL PROTO CODE

PLEASE

IGNORE

*/
public class LightboardController {
    // function to retrieve current weather data
    public static WeatherData getWeatherData() {
        // TODO: retrieve current weather data
        return new WeatherData();
    }
/*

ORIGINAL PROTO CODE

PLEASE

IGNORE

*/
    // function to retrieve current traffic data
    public static TrafficData getTrafficData() {
        // TODO: retrieve current traffic data
        return new TrafficData();
    }
/*

ORIGINAL PROTO CODE

PLEASE

IGNORE

*/
    // function to calculate current speed limit based on weather and traffic conditions
    public static int calculateSpeedLimit(WeatherData weatherData, TrafficData trafficData) {
        // TODO: calculate speed limit based on weather and traffic data
        return 55;
    }

    // function to display current speed limit on lightboard
    public static void displaySpeedLimit(int speedLimit) {
        // TODO: display speed limit on lightboard
        System.out.println("Current speed limit: " + speedLimit);
    }
/*

ORIGINAL PROTO CODE

PLEASE

IGNORE

*/
    public static void main(String[] args) {
        // continuously update speed limit every 5 seconds
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override/*

ORIGINAL PROTO CODE

PLEASE

IGNORE

*/
            public void run() {
                // retrieve current weather and traffic data
                WeatherData weatherData = getWeatherData();
                TrafficData trafficData = getTrafficData();

                // calculate current speed limit based on weather and traffic conditions
                int speedLimit = calculateSpeedLimit(weatherData, trafficData);

                // display current speed limit on lightboard
                displaySpeedLimit(speedLimit);
            }
        }, 0, 5000);
    }
}/*

ORIGINAL PROTO CODE

PLEASE

IGNORE

*/
