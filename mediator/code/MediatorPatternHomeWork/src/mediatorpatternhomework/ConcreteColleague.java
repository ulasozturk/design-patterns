package mediatorpatternhomework;

public class ConcreteColleague implements Colleague{

    private static int colleagueIDCount = 0;
    private int colleagueID;
    private String name;
    
    private Mediator mediator;

    public ConcreteColleague(String name, Mediator mediator) {
        this.mediator = mediator;
        this.colleagueID = colleagueIDCount++;
        this.name = name;
    }
    
    @Override
    public void send(String message) {
        System.out.println("----------");
        System.out.println(name + " @id" + colleagueID + " has send this message: " + message);
        System.out.println("----");
        mediator.send(message, this);
    }

    @Override
    public void receive(String message){
        System.out.println(name + " @id" + colleagueID + " has recevied this message: " + message);
    }

}
