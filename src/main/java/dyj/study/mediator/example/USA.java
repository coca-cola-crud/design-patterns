package dyj.study.mediator.example;

public class USA extends Country{
    public USA(UnitedNations unitedNations){
        super(unitedNations);
    }

    public void declare(String message){
        mediator.declare(message,this);
    }

    public void getMessage(String message){
        System.out.println("美国获得对方消息："+message);
    }


}
