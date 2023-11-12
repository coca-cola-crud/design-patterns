package dyj.study.simplefactory;

public class OperateFactory {

    public static Operator createOperate(String operate) {
        Operator operator = null;
        switch (operate) {
            case "+":
                operator = new Add();
                break;
            case "*":
                operator = new Multi();
                break;
            case "-":
                operator = new Sub();
                break;
            case "/":
                operator = new Div();
                break;
            default:
                break;
        }
        return operator;
    }
}
