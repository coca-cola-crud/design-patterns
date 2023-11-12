package dyj.study.builder;

public class Director {
    public void Construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }

}
