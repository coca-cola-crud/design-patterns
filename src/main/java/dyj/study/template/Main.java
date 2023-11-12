package dyj.study.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("dyj");
        Paper dyjPaper = new DyjPaper();
        dyjPaper.question1();
        dyjPaper.question2();
        dyjPaper.question3();

        System.out.println("zky");
        Paper zkyPaper = new ZkyPaper();
        zkyPaper.question1();
        zkyPaper.question2();
        zkyPaper.question3();
    }
}
