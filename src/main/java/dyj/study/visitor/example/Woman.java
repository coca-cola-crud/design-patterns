package dyj.study.visitor.example;

public class Woman extends Person{

            @Override
            public void accept(Action visitor) {
                visitor.getWomanConclusion(this);
            }
}
