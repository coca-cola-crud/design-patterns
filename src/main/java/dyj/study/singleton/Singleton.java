package dyj.study.singleton;

/**
 * 1、默认构造函数设置为private，防止外部创建实例
 * 2、提供一个静态方法，用于获取实例
 * 饿汉
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return singleton;
    }

}
