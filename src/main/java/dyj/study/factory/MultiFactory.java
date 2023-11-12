package dyj.study.factory;

public class MultiFactory implements IOperateFactory{
    public BaseOperator createOperator() {
        return new MultiOperator();
    }
}
