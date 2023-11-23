package dyj.study.iterator;

public class ConcreteIterator extends  Iterator{
    private ConcreteAggregate concreteAggregate;
    private int current = 0;
    public ConcreteIterator(ConcreteAggregate concreteAggregate){
        this.concreteAggregate = concreteAggregate;
    }


    @Override
    public Object first() {
        return concreteAggregate.get(0);
    }

    @Override
    public Object next() {
        Object res = null;
        current++;
        if(current<concreteAggregate.count()){
            res = concreteAggregate.get(current);
        }

        return res;
    }

    @Override
    public boolean isDone() {
        return current >= concreteAggregate.count();
    }

    @Override
    public Object currentItem() {
        return concreteAggregate.get(current);
    }
}
