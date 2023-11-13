package dyj.study.adapter;

public class Translator extends Player{
    private ForeignCenter foreignCenter;

    public Translator(String name){
        super(name);
        foreignCenter = new ForeignCenter(name);
    }
    @Override
    public void attack() {
        foreignCenter.attack_cn();
    }

    @Override
    public void defense() {
        foreignCenter.defense_cn();
    }
}
