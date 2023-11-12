package dyj.study.factory;

public class SubFactory implements IOperateFactory{
    public BaseOperator createOperator() {
        return new SubOperator();
    }
}
