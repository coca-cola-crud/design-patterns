package dyj.study.mediator;

public abstract class Mediator {
    public abstract void send(String message, Colleague colleague);
}
