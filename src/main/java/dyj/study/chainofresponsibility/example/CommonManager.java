package dyj.study.chainofresponsibility.example;

public class CommonManager extends Manager{

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.requestType.equals("请假") && request.num<=2){
            System.out.println(name+":"+request.requestType+request.num+"批准");

        }else if(manager!=null){
            manager.requestApplications(request);
        }
    }
}
