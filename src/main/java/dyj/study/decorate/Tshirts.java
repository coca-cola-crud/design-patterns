package dyj.study.decorate;

public class Tshirts extends Decorator{

    public Tshirts() {
    }
    public Tshirts(String name) {
        super(name);
    }


    @Override
    public void show(){
        System.out.println("穿T恤");
        // 调用Decorator的show方法
        super.show();
    }
}
