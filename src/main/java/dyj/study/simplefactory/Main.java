package dyj.study.simplefactory;

public class Main {
    public static void main(String[] args) {
        Operator operator = OperateFactory.createOperate("+");
        operator.numberA = 1;
        operator.numberB = 2;
        System.out.println(operator.getResult());

    }
}
