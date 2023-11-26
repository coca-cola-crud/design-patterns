package dyj.study.flyweight.example;

public class Main {
    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSite("产品展示");
        webSite1.use(new User("小菜"));
        WebSite webSite2 = factory.getWebSite("产品展示");
        webSite2.use(new User("大鸟"));
        WebSite webSite3 = factory.getWebSite("产品展示");
        webSite3.use(new User("娇娇"));
        WebSite webSite4 = factory.getWebSite("博客");
        webSite4.use(new User("老顽童"));
        WebSite webSite5 = factory.getWebSite("博客");
        webSite5.use(new User("桃谷六仙"));
        WebSite webSite6 = factory.getWebSite("博客");
        webSite6.use(new User("南海鳄神"));
        System.out.println("网站分类总数为：" + factory.getWebSiteCount());
    }
}
