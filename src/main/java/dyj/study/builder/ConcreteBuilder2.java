package dyj.study.builder;

public class ConcreteBuilder2 extends Builder{
    private Product product = new Product();

    @Override
    public void BuildPartA(){
        product.add("部件X");
    }

    @Override
    public void BuildPartB(){
        product.add("部件Y");
    }

    @Override
    public Product GetResult(){
        return product;
    }
}
