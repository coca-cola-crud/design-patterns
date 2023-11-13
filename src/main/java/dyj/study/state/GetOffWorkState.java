package dyj.study.state;

public class GetOffWorkState extends State{

    @Override
    public void writeProgram(Work w) {
        if(w.getHour()>=20){
            System.out.println("当前时间："+w.getHour()+"点 下班回家了");
        }else {
            System.out.println("当前时间："+w.getHour()+"点,8点走哦，还没到点呢");
        }
    }
}
