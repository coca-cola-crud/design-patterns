package dyj.study.simplefactory;

public class Add extends Operator{
    @Override
    public int getResult(){
        return numberA + numberB;
    }
}
