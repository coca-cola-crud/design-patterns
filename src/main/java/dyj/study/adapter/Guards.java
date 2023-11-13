package dyj.study.adapter;

public class Guards extends Player{
    public Guards(String name){
        super(name);
    }
    @Override
    public void attack() {
        System.out.println("后卫"+name+"attack");
    }

    @Override
    public void defense() {
        System.out.println("后卫"+name+"defense");
    }
}
