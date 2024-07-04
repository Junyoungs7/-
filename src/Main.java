import 옵저버패턴.FirstDisplay;
import 옵저버패턴.WeatherData;
import 전략패턴.Duck;
import 전략패턴.MallardDuck;
import 전략패턴.flyNoWay;
import 전략패턴.flyWithWings;

public class Main {
    public static void main(String[] args) {
//        strategyPattern();
        observerPattern();
    }

    public static void strategyPattern(){
        Duck duck = new MallardDuck(new flyWithWings());
        duck.fly();
        duck.changeFly(new flyNoWay());
        duck.fly();
    }

    public static void observerPattern(){
         WeatherData weatherData = new WeatherData();
         FirstDisplay firstDisplay = new FirstDisplay(weatherData);
         weatherData.setMeasurements(80, 65, 30.4f);
         weatherData.setMeasurements(82, 70, 29.2f);
         weatherData.setMeasurements(78, 90, 29.2f);
    }
}