package dyj.study.state;

public class Main {
    public static void main(String[] args) {
        Work w = new Work();
        w.setHour(9);
        w.writeProgram();
        w.setHour(10);
        w.writeProgram();
        w.setHour(12);
        w.writeProgram();
        w.setHour(13);
        w.writeProgram();
        w.setHour(14);
        w.writeProgram();
        w.setHour(17);
        w.writeProgram();
        w.setHour(19);
        w.writeProgram();
        w.setHour(20);
        w.writeProgram();
    }
}
