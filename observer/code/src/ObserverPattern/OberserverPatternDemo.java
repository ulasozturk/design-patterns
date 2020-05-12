package ObserverPattern;

public class OberserverPatternDemo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject(7,7.5,8);
        UpdateValuesContinously update = new UpdateValuesContinously(subject, 7.2, 7.6, 8.2, 1000);
        Thread thread = new Thread(update);
        thread.start();
        ConcreteObserver observer1 = new ConcreteObserver("Investing.com", subject);
        try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        
        ConcreteObserver observer2 = new ConcreteObserver("Doviz.com", subject);
        try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        
        ConcreteObserver observer3 = new ConcreteObserver("Foreks.com", subject);
        try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        subject.unregister(observer2);        
    }
    
}
