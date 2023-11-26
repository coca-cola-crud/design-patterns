package dyj.study.flyweight;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("X");
        Flyweight flyweight2 = factory.getFlyweight("X");
        Flyweight flyweight3 = factory.getFlyweight("Y");
        Flyweight flyweight4 = factory.getFlyweight("Y");
        flyweight1.Operation(1);
        flyweight2.Operation(2);
        flyweight3.Operation(3);
        flyweight4.Operation(4);

    }
}
