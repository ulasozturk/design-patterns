package mediatorpatternhomework;

import java.util.ArrayList;

public class ConcreteMediator implements Mediator{
    private ArrayList<Colleague> colleagues;
    
    public ConcreteMediator(){
        colleagues = new ArrayList<Colleague>();
    }
    
    @Override
    public void send(String message, Colleague origin) {
        for(Colleague colleague: colleagues){
            if(colleague != origin){
                colleague.receive(message);
            }
        }
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void removeColleague(Colleague colleague) {
        colleagues.remove(colleague);
    }
    
}
