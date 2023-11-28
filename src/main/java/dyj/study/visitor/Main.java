package dyj.study.visitor;

public class Main {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());
        ConcreteVisitor1 visitor1 = new ConcreteVisitor1();
        ConcreteVisitor2 visitor2 = new ConcreteVisitor2();
        objectStructure.accept(visitor1);
        objectStructure.accept(visitor2);

    }
}
