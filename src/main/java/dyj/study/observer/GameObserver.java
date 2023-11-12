package dyj.study.observer;

public class GameObserver implements Observer{

    private String name;
    private Subject subject;
    public GameObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update(String message) {
        System.out.println("name: " + name + " message: " + message + " 关闭游戏，继续工作！");
    }
}
