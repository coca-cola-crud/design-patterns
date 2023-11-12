package dyj.study.simplefactory;

public class Sub extends Operator{
    @Override
    public int getResult(){
        return numberA - numberB;
    }
}
