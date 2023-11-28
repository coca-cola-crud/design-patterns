package dyj.study.visitor.example;

public abstract class Person {
    public abstract void accept(Action visitor);
}
