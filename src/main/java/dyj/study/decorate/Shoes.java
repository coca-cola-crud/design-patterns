package dyj.study.decorate;

public class Shoes extends Decorator{

    public Shoes() {
    }

    public Shoes(String name) {
        super(name);
    }
    @Override
    public void show(){
        System.out.println("穿鞋子");
        super.show();
    }
}
