package dyj.study.decorate;

public class Main {
    public static void main(String[] args) {
        Person dyj = new Person("dyj");
        Decorator jeans = new Jeans();
        Decorator shoes = new Shoes();
        Decorator tshirts = new Tshirts();
        jeans.Decorate(dyj);
        shoes.Decorate(jeans);
        tshirts.Decorate(shoes);
        tshirts.show();
    }
}
