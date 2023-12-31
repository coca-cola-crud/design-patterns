package dyj.study.mediator;

public class ConcreteColleague2 extends Colleague{
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void call(String message) {
        System.out.println("ConcreteColleague2 call: " + message);
    }
}
