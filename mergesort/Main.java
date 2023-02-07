import java.util.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(9);
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(8);
        a.add(10);

        MergeSort ms = new MergeSort();
        a = ms.mergesort(a);
        System.out.println(a);

    }
    
}