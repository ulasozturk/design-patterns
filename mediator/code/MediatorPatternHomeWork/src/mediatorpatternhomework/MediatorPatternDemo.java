package mediatorpatternhomework;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        ConcreteMediator chatMediator = new ConcreteMediator();
        ConcreteColleague concreteColleague1 = new ConcreteColleague("Ulaş", chatMediator);
        ConcreteColleague concreteColleague2 = new ConcreteColleague("Ali", chatMediator);
        ConcreteColleague concreteColleague3 = new ConcreteColleague("Berkay", chatMediator);
        ConcreteColleague concreteColleague4 = new ConcreteColleague("Barış", chatMediator);

        chatMediator.addColleague(concreteColleague1);
        chatMediator.addColleague(concreteColleague2);
        chatMediator.addColleague(concreteColleague3);
        chatMediator.addColleague(concreteColleague4);
        
        concreteColleague1.send("Selam arkadaşlar. Nasılsınız ?");
        concreteColleague2.send("İyidir, seni sormalı?");
        concreteColleague3.send("İyi, sen nasılsın?");
        concreteColleague1.send("Sağolun arkadaşlar. Ben de iyiyim.");
    }

}
