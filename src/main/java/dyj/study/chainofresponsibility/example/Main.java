package dyj.study.chainofresponsibility.example;

public class Main {
    public static void main(String[] args) {
        Manager commonManager = new CommonManager("经理");
        Manager majorManager = new Majordomo("总监");
        Manager generalManager = new GeneralManager("总经理");
        commonManager.setManager(majorManager);
        majorManager.setManager(generalManager);

        Request request1 = new Request();
        request1.requestType = "请假";
        request1.requestContent = "小菜请假";
        request1.num = 1;
        commonManager.requestApplications(request1);

        Request request2 = new Request();
        request2.requestType = "请假";
        request2.requestContent = "小菜请假";
        request2.num = 4;
        commonManager.requestApplications(request2);

        Request request3 = new Request();
        request3.requestType = "加薪";
        request3.requestContent = "小菜请求加薪";
        request3.num = 500;
        commonManager.requestApplications(request3);

        Request request4 = new Request();
        request4.requestType = "加薪";
        request4.requestContent = "小菜请求加薪";
        request4.num = 1000;
        commonManager.requestApplications(request4);
    }
}
