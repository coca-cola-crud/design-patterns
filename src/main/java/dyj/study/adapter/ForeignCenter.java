package dyj.study.adapter;

/**
 * 外籍选手没有继承Player接口，但是可以通过适配器模式，让外籍选手也能够符合Player接口的要求
 */
public class ForeignCenter{
    private String name;
    public ForeignCenter(String name){
      this.name = name;
    }

    public void attack_cn() {
        System.out.println("外籍中锋"+name+"attack");
    }


    public void defense_cn() {
        System.out.println("外籍中锋"+name+"defense");
    }
}
