package dyj.study.flyweight;

public class UnshareConcreteFlyweight extends Flyweight{

    @Override
    public void Operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight:"+extrinsicstate);
    }
}
