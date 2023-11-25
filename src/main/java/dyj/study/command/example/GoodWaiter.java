package dyj.study.command.example;

import java.util.ArrayList;
import java.util.List;

public class GoodWaiter {
    private List<Command> commands = new ArrayList<>();
    private Integer bakeMuttonNums = 2;
    private Integer bakeChickenWingNums = 2;

    public void setCommands(Command command){
        String food = command.getClass().getName();
        if (bakeChickenWingNums==0&&food.equals("dyj.study.command.example.BakeChickenWingCommand")){
            System.out.println("鸡翅卖完了");
        }else if(bakeMuttonNums==0&&food.equals("dyj.study.command.example.BakeMuttonCommand")){
            System.out.println("羊肉卖完了");
        }else if(food.equals("dyj.study.command.example.BakeMuttonCommand")){
            commands.add(command);
            bakeMuttonNums--;
        }else {
            commands.add(command);
            bakeChickenWingNums--;
        }

    }

    public void cancelCommands(Command command){
        commands.remove(command);
    }

    public void tongzhi(){
        for(Command command:commands){
            command.excuteCommand();
        }
    }
}
