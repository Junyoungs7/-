package 옵저버패턴;

public class FirstDisplay implements Observer{

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public FirstDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("FirstDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }
}
