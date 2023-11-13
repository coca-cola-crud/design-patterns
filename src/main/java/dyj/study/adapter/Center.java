package dyj.study.adapter;

public class Center extends Player{
    public Center(String name){
        super(name);
    }
    @Override
    public void attack() {
        System.out.println("中锋"+name+"attack");
    }

    @Override
    public void defense() {
        System.out.println("中锋"+name+"defense");
    }
}
