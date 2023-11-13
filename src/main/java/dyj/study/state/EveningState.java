package dyj.study.state;

public class EveningState extends State{
    @Override
    public void writeProgram(Work w) {
        if(w.getHour()<21){
            System.out.println("当前时间："+w.getHour()+"点 加班哦，疲累之极");
        }else {
            w.setCurrent(new SleepingState());
            w.writeProgram();
        }
    }

}
