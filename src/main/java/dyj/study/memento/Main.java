package dyj.study.memento;

public class Main {
    public static void main(String[] args) {
        Originator o  = new Originator();
        o.setState("on");
        System.out.println(o.getState());

        Memento memento = o.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);

        o.setState("off");
        System.out.println(o.getState());

        o.setMemento(caretaker.getMemento());
        System.out.println(o.getState());



    }
}
