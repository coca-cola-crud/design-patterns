package dyj.study.bridge;

public class Book implements PhoneSoft{
    @Override
    public void run() {
        System.out.println("安装通讯录");
    }
}
