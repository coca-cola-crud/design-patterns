package dyj.study.factory;

public class AddFactory implements IOperateFactory{
    public BaseOperator createOperator() {
        return new AddOperator();
    }
}
