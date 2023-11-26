package dyj.study.mediator;

public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void call(String message) {
        System.out.println("ConcreteColleague1 call: " + message);
    }
}
