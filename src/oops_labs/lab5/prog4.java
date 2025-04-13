package src.oops_labs.lab5;
//Design a Weather class with a static nested class Forecast.
//a) The Forecast class should predict weather conditions (Sunny, Rainy, Cloudy) based on
//input data like temperature and humidity.
//b) Use the nested class to predict and display the weather forecast for different cities.
class weather{

    static class forecast{
        String city;
        int temp,humidity;

        String Weather_condition = "no data";

        public forecast(String city, int temperature, int humidity) {
            this.city = city;
            this.temp = temperature;
            this.humidity = humidity;
            Weather_condition=predictWeather();
        }

        public String predictWeather() {
            if (temp > 30 && temp < 40) {
                return "Sunny";
            } else if (humidity > 70) {
                return "Rainy";
            } else {
                return "Cloudy";
            }
        }
        public void display(){
            System.out.println("city = "+city);
            System.out.println("temp:- "+temp);
            System.out.println("humidity:- "+ humidity);
            System.out.println("the predicted forecast is:- "+Weather_condition);
        }

    }
}
public class prog4 {
    public static void main(String[]args){
        weather.forecast banglore = new weather.forecast("Banglore",25,40);
        banglore.predictWeather();
        banglore.display();
    }

}
