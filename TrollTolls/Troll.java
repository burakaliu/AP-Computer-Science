package TrollTolls;

public class Troll{
    
    public Troll(){
        System.out.println("Troll");
    }

    private static int total = 0;     
    private int money = 0;

     // collect money
    public void collect(double d){
        money += d;
        total += d;
    }

     // returns this troll's money
    public double myMoney(){
        return money;
    }

    // returns total money collected by all trolls
    public static double treasury(){
        return total;
    } 

     // sets the total money collected by all trolls to 0
    // DOES NOT HAVE TO EMPTY ALL INDIVIDUAL TROLL'S MONEIES
    public static void emptyTreasury(){
        total = 0;
    }
}
