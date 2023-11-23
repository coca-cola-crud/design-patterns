package dyj.study.bridge;

public class Main {
    public static void main(String[] args) {
        PhoneBrand huawei = new Huawei();
        PhoneSoft tikTok = new TikTok();
        PhoneSoft game = new HonourOfKings();
        huawei.setSoft(game);
        huawei.run();
        huawei.setSoft(tikTok);
        huawei.run();
    }

}
