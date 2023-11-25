package dyj.study.command.example;

public class BakeChickenWingCommand extends Command{

    @Override
    public void excuteCommand() {
       barbecuer.bakeChickenWing();
    }
}
