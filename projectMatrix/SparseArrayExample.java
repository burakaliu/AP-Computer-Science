/*
 * NOT A PART OF THE PROJECT THIS IS JUST FOR REFERENCE AND LEARNING PURPOSES
 */
import java.util.HashMap;
import java.util.Map;

public class SparseArrayExample {
    public static void main(String[] args) {
        //Declare a 2D array originalArray and initialize it with some values.
        int[][] originalArray = {{0, 0, 0}, {0, 1, 0}, {0, 0, 2, 0, 0}};

        //Declare a Map called sparseArray that will store the non-zero values of the original array in a compressed format.
        Map<Integer, Map<Integer, Integer>> sparseArray = new HashMap<>();

        //Iterate through each element of the originalArray using a nested for loop.
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[i].length; j++) {
                /*
                 * For each non-zero element in the originalArray, add it to the sparseArray. 
                 * To do this, check if the value at originalArray[i][j] is not equal to 
                 * zero, and if so, add it to the sparseArray. 
                 * This is done by creating a new Map for the row i in the sparseArray if 
                 * it does not already exist, and then adding the non-zero element to this row.
                 */
                if (originalArray[i][j] != 0) {
                    if (!sparseArray.containsKey(i)) {
                        sparseArray.put(i, new HashMap<>());
                    }
                    sparseArray.get(i).put(j, originalArray[i][j]);
                }
            }
        }

        //
        
        /*
         * Once the sparseArray has been populated, iterate through each element of the originalArray 
         * again and print out the corresponding value from the sparseArray. If the element is zero, print 0 instead. 
         * This is done by checking if the sparseArray contains a non-zero value for the current element's 
         * row i and column j, and if so, printing out that value. Otherwise, print 0.
        */
        for (int i = 0; i < originalArray.length; i++) {
            for (int j = 0; j < originalArray[0].length; j++) {
                if (sparseArray.containsKey(i) && sparseArray.get(i).containsKey(j)) {
                    System.out.print(sparseArray.get(i).get(j) + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

