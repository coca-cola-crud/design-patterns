package dyj.study.factory;

public class Main {
    public static void main(String[] args) {
        IOperateFactory addFactory = new AddFactory();
        BaseOperator addOperator = addFactory.createOperator();
        addOperator.numberA = 1;
        addOperator.numberB = 2;
        System.out.println(addOperator.getResult());

        IOperateFactory divFactory = new DivFactory();
        BaseOperator divOperator = divFactory.createOperator();
        divOperator.numberA = 1;
        divOperator.numberB = 2;
        System.out.println(divOperator.getResult());

        IOperateFactory multiFactory = new MultiFactory();
        BaseOperator multiOperator = multiFactory.createOperator();
        multiOperator.numberA = 1;
        multiOperator.numberB = 2;
        System.out.println(multiOperator.getResult());
    }
}
