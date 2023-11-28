package dyj.study.visitor.example;

public class Main {
    public static void main(String[] args) {
        // 访问者
        Action action = new ConcreteAction();
        // 被访问的元素
        Man man = new Man();
        man.accept(action);
        Woman woman = new Woman();
        woman.accept(action);
    }
}
