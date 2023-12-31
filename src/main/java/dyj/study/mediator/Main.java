package dyj.study.mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(concreteMediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(concreteMediator);
        concreteMediator.setConcreteColleague1(concreteColleague1);
        concreteMediator.setConcreteColleague2(concreteColleague2);

        concreteColleague1.send("2你好");
        concreteColleague2.send("1你好");
    }
}
