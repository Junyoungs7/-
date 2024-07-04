package 옵저버패턴;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void setMeasurements(float temperature, float humidity, float pressure);
    void notifyObservers();
}
