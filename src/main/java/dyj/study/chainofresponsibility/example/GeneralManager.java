package dyj.study.chainofresponsibility.example;

public class GeneralManager extends Manager{

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if(request.requestType.equals("请假")){
            System.out.println(name+":"+request.requestContent+request.num+"批准");
        }else if(request.requestType.equals("加薪") && request.num<=500){
            System.out.println(name+":"+request.requestContent+request.num+"批准");
        }else if(request.requestType.equals("加薪") && request.num>500){
            System.out.println(name+":"+request.requestContent+request.num+"再说吧");
        }
    }
}
