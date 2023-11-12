package dyj.study.observer;

public class StockObserver implements Observer{

    private String name;
    private Subject subject;
    public StockObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }
    @Override
    public void update(String message) {
        System.out.println("name: " + name + " message: " + message + " 关闭股票行情，继续工作！");
    }
}
