package dyj.study.builder;

public class Main {
    public static void main(String[] args) {
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        // 包工头
        Director director = new Director();
        director.Construct(builder1);
        Product product1 = builder1.GetResult();
        product1.show();

        director.Construct(builder2);
        Product product2 = builder2.GetResult();
        product2.show();
    }
}
