package dyj.study.command.example;

public class BakeMuttonCommand extends Command{

    @Override
    public void excuteCommand() {
        barbecuer.bakeMutton();
    }
}
