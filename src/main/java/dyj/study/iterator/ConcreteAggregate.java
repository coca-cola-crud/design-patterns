package dyj.study.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{
    private List<Object> items = new ArrayList<>();
    public Object add(Object obj){
        return items.add(obj);
    }

    @Override
    Iterator createIterator() {
        return new ConcreteIterator(this);
    }



    public Object get(int index){
        return items.get(index);
    }

    public int count(){
        return items.size();
    }
}
