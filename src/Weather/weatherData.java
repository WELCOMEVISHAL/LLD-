package Weather;

import java.util.ArrayList;
import java.util.List;

public class weatherData implements Subject{
    float temp;
    float humidity;

    List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o){
        observers.add(o);
        System.out.println("Observer added");
    }

    public void removeObserver(Observer o){
        observers.remove(o);
        System.out.println("Observer removed");
    }

    public void notifyObserver(){
        for(Observer o: observers){
            o.update(temp, humidity);
            notifyObserver();
        }
    }

    public void setMeasurements(float temp, float humidity){
        this.temp = temp;
        this.humidity = humidity;
        notifyObserver();
    }
}
