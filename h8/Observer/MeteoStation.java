package Asem4.h8.Observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observable {
    int temp;
    int pres;
    List<Observer> observers = new ArrayList<>();
    public void setMeasurements(int t, int p){
        temp = t;
        pres = p;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.handleEvent(temp, pres);
        }

    }
}
