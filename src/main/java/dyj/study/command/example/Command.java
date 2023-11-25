package dyj.study.command.example;

public abstract class Command {
    protected Barbecuer barbecuer;

    public void setBarbecuer(Barbecuer barbecuer){
        this.barbecuer = barbecuer;
    }

    public abstract void excuteCommand();
}
