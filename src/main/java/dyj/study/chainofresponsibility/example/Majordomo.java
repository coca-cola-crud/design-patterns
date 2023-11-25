package dyj.study.chainofresponsibility.example;

public class Majordomo extends Manager{
    public Majordomo(String name){
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.requestType.equals("请假") && request.num <= 5){
            System.out.println(name+":"+request.requestContent+request.num+"批准");
        }else if(manager != null){
            manager.requestApplications(request);
        }
    }
}
