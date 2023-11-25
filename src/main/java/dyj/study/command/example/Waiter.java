package dyj.study.command.example;

/**
 * 只能传递一道菜的服务员
 */
public class Waiter {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void tongzhi(){
        command.excuteCommand();
    }

}
