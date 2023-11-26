package dyj.study.mediator;

// 具体中介者
public class ConcreteMediator extends Mediator{
    private ConcreteColleague1 concreteColleague1;
    private ConcreteColleague2 concreteColleague2;


    public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
        this.concreteColleague1 = concreteColleague1;
    }

    public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
        this.concreteColleague2 = concreteColleague2;
    }
    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == concreteColleague1) {
            concreteColleague1.call(message);
        }else {
            concreteColleague2.call(message);
        }
    }
}
