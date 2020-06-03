package mediatorpatternhomework;

public interface Mediator {
    public void addColleague(Colleague colleague);
    public void removeColleague(Colleague colleague);
    public void send(String message, Colleague colleague);
}
