import java.util.HashMap;
import java.util.Map;

/**
 * A class representing a sparse array.
 * A sparse array is an array in which most of the elements are zero.
 * In this implementation, non-zero elements are stored in a Map.
 */
public class SparseArray {

    private int numRows;
    private int numCols;
    private Map<Integer, Map<Integer, Double>> sparseArray = new HashMap<>();

    /**
     * Constructs a SparseArray with the given number of rows and columns.
     *
     * @param numRows the number of rows in the array
     * @param numCols the number of columns in the array
    */
    public SparseArray(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
    }

    /**
     * Sets the value of the element at the specified row and column.
     * If the value is zero, the element is not stored in the sparse array.
     *
     * @param row the row index of the element to set
     * @param col the column index of the element to set
     * @param value the value to set the element to
     * @throws SparseArrayException if the row or column index is out of range
    */
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

    /**
     * Returns the value of the element at the specified row and column.
     * If the element is not stored in the sparse array, the method returns 0.
     *
     * @param row the row index of the element to get
     * @param col the column index of the element to get
     * @return the value of the element at the specified row and column, or 0 if the element is not stored in the sparse array
     * @throws SparseArrayException if the row or column index is out of range
    */
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
