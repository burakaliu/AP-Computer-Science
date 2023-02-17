import java.util.HashMap;
import java.util.Map;

public class SparseArray {

    private int numRows;
    private int numCols;
    private Map<Integer, Map<Integer, Double>> sparseArray = new HashMap<>();


    public SparseArray(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
    }

    public void set(int row, int col, double value) throws SparseArrayException{
        if (row < 0 || row >= numRows || col < 0 || col >= numCols) {
            throw new SparseArrayException("Index out of range.");
        }
        if (value != 0) {
            if (!sparseArray.containsKey(row)) {
                sparseArray.put(row, new HashMap<>());
            }
            sparseArray.get(row).put(col, value);
        }
    }

    public double get(int row, int col) throws SparseArrayException{
        if (row < 0 || row >= numRows || col < 0 || col >= numCols) {
            throw new SparseArrayException("Index out of range.");
        }
        if (sparseArray.containsKey(row) && sparseArray.get(row).containsKey(col)) {
            return sparseArray.get(row).get(col);
        } else {
            return 0;
        }
    }

}
