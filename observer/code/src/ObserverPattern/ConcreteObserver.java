package ObserverPattern;

public class ConcreteObserver implements Observer {

    private double dollar;
    private double euro;
    private double sterlin;

    private static int observerIDCount = 0;

    private int observerID;
    private String observerName;

    public ConcreteObserver(String observerName, Subject subject) {
        this.observerID = observerIDCount++;
        this.observerName = observerName;
        subject.register(this);
    }

    @Override
    public void update(double dollar, double euro, double sterlin) {
        this.dollar = dollar;
        this.euro = euro;
        this.sterlin = sterlin;
        printValues();
    }

    public void printValues() {
        //System.out.println("---------");
        System.out.println("OberserverID: " + observerID + ", ObserverName: " + observerName);
        System.out.println("Dollar: " + dollar);
        System.out.println("Euro: " + euro);
        System.out.println("Sterlin: " + sterlin);
        //System.out.println("---------");
    }
}
