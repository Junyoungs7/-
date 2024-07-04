package 옵저버패턴;

public interface Observer {
    void update(float temp, float humidity, float pressure);
    void display();
}
