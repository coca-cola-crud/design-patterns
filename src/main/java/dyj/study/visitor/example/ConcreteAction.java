package dyj.study.visitor.example;

public class ConcreteAction extends Action{
    @Override
    public void getManConclusion(Man man) {
        System.out.println(man.getClass().getSimpleName()+"成功时，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println(woman.getClass().getSimpleName()+"成功时，背后多半有一个不成功的男人");
    }
}
