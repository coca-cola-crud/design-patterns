package dyj.study.iterator;

public class ConcreteIteratorDesc extends Iterator{
    private ConcreteAggregate concreteAggregate;
    private int current = 0;
    public ConcreteIteratorDesc(ConcreteAggregate concreteAggregate){
        this.concreteAggregate = concreteAggregate;
        this.current = concreteAggregate.count()-1;
    }
    @Override
    public Object first() {

        return concreteAggregate.get(current);
    }

    @Override
    public Object next() {
        Object res = null;
        if(current-1>=0){
            res = concreteAggregate.get(current-1);

        }
        current--;
        return res;
    }

    @Override
    public boolean isDone() {
        return current<0;
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.get(current);
    }
}
