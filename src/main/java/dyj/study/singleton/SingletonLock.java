package dyj.study.singleton;

public class SingletonLock {

    // volatile禁止指令重排
    private volatile static SingletonLock singleton;
    // 构造函数私有化，防止外部创建实例
    private SingletonLock(){

    }

    public static SingletonLock getInstance(){
        if(singleton == null){
            synchronized (SingletonLock.class){
                // 双重检查，防止第二个线程进入同步块时，第一个线程已经创建了实例
                if(singleton == null){
                    singleton = new SingletonLock();
                }
            }
        }
        return singleton;
    }
}
