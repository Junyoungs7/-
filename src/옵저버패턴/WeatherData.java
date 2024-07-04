package 옵저버패턴;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private final List<Observer> observers;

public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temperature, humidity, pressure);
        }
    }
}
