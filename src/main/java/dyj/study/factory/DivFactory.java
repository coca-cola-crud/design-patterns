package dyj.study.factory;

public class DivFactory implements IOperateFactory{
    public BaseOperator createOperator() {
        return new DivOperator();
    }
}
