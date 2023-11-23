package dyj.study.iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.add(1);
        concreteAggregate.add(2);
        concreteAggregate.add(3);
        concreteAggregate.add(4);
        concreteAggregate.add(5);
        concreteAggregate.add(6);

        Iterator iterator = new ConcreteIteratorDesc(concreteAggregate);
        while(!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();

        }


    }
}
