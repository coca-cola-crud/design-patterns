package dyj.study.flyweight.example;

public class ConcreteWebSite extends WebSite{

    // 网站发布的形式
    private String name = "";

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站分类："+name+" 用户："+user.getName());
    }
}
