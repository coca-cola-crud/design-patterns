package dyj.study.builder;

public class ConcreteBuilder1 extends Builder{
    private Product product = new Product();

    @Override
    public void BuildPartA(){
        product.add("部件A");
    }

    @Override
    public void BuildPartB(){
        product.add("部件B");
    }

    @Override
    public Product GetResult(){
        return product;
    }
}
