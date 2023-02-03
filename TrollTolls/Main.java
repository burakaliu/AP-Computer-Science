package TrollTolls;

public class Main {
    public static void main(String[] args) {
        Troll t1 = new Troll();
        Troll t2 = new Troll();

        t1.collect(10);
        t2.collect(20);
        System.out.println(t1.myMoney());
        System.out.println(t2.myMoney());
        System.out.println(Troll.treasury());
    }
}
