package dyj.study.command.example;

public class Main {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        BakeMuttonCommand bakeMuttonCommand = new BakeMuttonCommand();
        bakeMuttonCommand.setBarbecuer(barbecuer);
        BakeChickenWingCommand bakeChickenWingCommand = new BakeChickenWingCommand();
        bakeChickenWingCommand.setBarbecuer(barbecuer);
        Waiter waiter = new Waiter();

        waiter.setCommand(bakeMuttonCommand);
        waiter.tongzhi();

        waiter.setCommand(bakeChickenWingCommand);
//        waiter.tongzhi();

        GoodWaiter goodWaiter = new GoodWaiter();
        goodWaiter.setCommands(bakeMuttonCommand);
        goodWaiter.setCommands(bakeMuttonCommand);
        goodWaiter.setCommands(bakeMuttonCommand);
        goodWaiter.setCommands(bakeMuttonCommand);
        goodWaiter.setCommands(bakeChickenWingCommand);
        goodWaiter.setCommands(bakeChickenWingCommand);
        goodWaiter.setCommands(bakeChickenWingCommand);
        goodWaiter.tongzhi();

    }
}
