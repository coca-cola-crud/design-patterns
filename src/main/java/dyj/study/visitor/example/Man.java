package dyj.study.visitor.example;

public class Man extends Person{

        @Override
        public void accept(Action visitor) {
            visitor.getManConclusion(this);
        }
}
