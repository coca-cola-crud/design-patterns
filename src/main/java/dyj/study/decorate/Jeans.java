package dyj.study.decorate;

public class Jeans extends  Decorator{

    public Jeans() {
    }
    public Jeans(String name) {
        super(name);
    }

    @Override
    public void show(){
        System.out.println("穿牛仔裤");
        super.show();
    }
}
