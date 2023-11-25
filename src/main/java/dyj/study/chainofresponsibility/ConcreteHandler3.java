package dyj.study.chainofresponsibility;

public class ConcreteHandler3 extends Handler{


    @Override
    public void HandleRequest(int request) {
        if(request>=20 && request<30){
            System.out.println("3处理请求");
        }else if(successor != null){
            successor.HandleRequest(request);
        }
    }
}
