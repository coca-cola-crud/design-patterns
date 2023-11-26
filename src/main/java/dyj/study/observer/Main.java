package dyj.study.observer;

public class Main {
    public static void main(String[] args) {
        Subject boss = new Boss();
        boss.attach(new GameObserver("dyj", boss));
        boss.attach(new StockObserver("zky", boss));
        boss.notify("老板回来了");
    }
}
