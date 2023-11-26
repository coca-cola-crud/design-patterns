package dyj.study.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String,Flyweight> flyweightHashMap = new HashMap<>();

    public FlyweightFactory(){
        flyweightHashMap.put("X",new ConcreteFlyweight());
        flyweightHashMap.put("Y",new ConcreteFlyweight());
        flyweightHashMap.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return flyweightHashMap.get(key);
    }
}
