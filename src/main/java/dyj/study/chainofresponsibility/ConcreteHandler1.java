package dyj.study.chainofresponsibility;

public class ConcreteHandler1 extends Handler{
    @Override
    public void HandleRequest(int request) {
        if(request >=0 && request < 10){
            System.out.println("1处理请求");
        }else if(successor!=null){
            successor.HandleRequest(request);
        }
    }
}
