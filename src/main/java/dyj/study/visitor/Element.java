package dyj.study.visitor;

public abstract class Element {
    public abstract void accept(Visitor visitor);
}
