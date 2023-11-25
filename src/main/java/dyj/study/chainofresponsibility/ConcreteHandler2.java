package dyj.study.chainofresponsibility;

public class ConcreteHandler2 extends Handler{
    @Override
    public void HandleRequest(int request) {
        if(request >= 10 && request < 20){
            System.out.println("2处理请求");
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
