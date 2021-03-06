package CarRentalSim;

import java.util.ArrayList;

/**
 * Abstract class for Observer Pattern's Subject
 */
public abstract class  Subject {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    protected void notifyObservers(){
        for (Observer obs: this.observers) {
            obs.update();
        }
    }
}
