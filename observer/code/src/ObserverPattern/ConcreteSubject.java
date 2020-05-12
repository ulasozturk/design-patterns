package ObserverPattern;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {

    private double dollar;
    private double euro;
    private double sterlin;

    private final Object MUTEX = new Object();

    private ArrayList<Observer> observers;

    public ConcreteSubject(double dollar, double euro, double sterlin) {
        this.dollar = dollar;
        this.euro = euro;
        this.sterlin = sterlin;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) {
            return;
        }

        synchronized (MUTEX) {
            if (observers == null) {
                observers = new ArrayList<Observer>();
            }
            observers.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {
        if (observers == null) {
            return;
        }

        synchronized (MUTEX) {
            if (observers != null) {
                observers.remove(observer);
            }
        }
    }

    @Override
    public void notifyObservers() {
        ArrayList<Observer> observersCopy;

        synchronized (MUTEX) {
            if (observers == null) {
                return;
            }
            if (observers.size() == 0) {
                System.out.println("There is no observer");
            }
            observersCopy = new ArrayList<>(observers);
        }

        for (Observer observer : observersCopy) {
            observer.update(dollar, euro, sterlin);
        }
    }

    public void setValues(double dollar, double euro, double sterlin) {
        this.dollar = dollar;
        this.euro = euro;
        this.sterlin = sterlin;
        System.out.println("---------");
        showValues();
        showObservers();
        System.out.println("---------");
        notifyObservers();

    }

    public void showObservers() {
        System.out.println("Registered observers: " + observers.size());
    }

    public void showValues() {
        System.out.println("New values: " + dollar + "," + euro + "," + sterlin);
    }

}
