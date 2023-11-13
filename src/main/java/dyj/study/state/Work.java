package dyj.study.state;

public class Work {
    private State current;
    private double hour;

    // 初始化为上午工作状态，即上午9点开始上班
    public Work(){
        current = new ForenoonState();
    }

    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
