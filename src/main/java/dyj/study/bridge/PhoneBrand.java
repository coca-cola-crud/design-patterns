package dyj.study.bridge;

public abstract class PhoneBrand { // 手机品牌
    protected PhoneSoft soft; // 手机软件

    public void setSoft(PhoneSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
