package dyj.study.observer;

// 通知者接口
public interface Subject {
    // 增加观察者
    public void attach(Observer observer);

    // 删除观察者
    public void detach(Observer observer);

    // 通知观察者
    public void notify(String message);

}
