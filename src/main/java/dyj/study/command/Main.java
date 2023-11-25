package dyj.study.command;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();  // 厨师
        Command command = new ConcreteCommand(receiver); // 点菜
        Invoker invoker = new Invoker(); // 服务员
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
