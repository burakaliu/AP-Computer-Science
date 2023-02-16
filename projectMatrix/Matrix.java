public class Matrix {
    
    private int numRows;
    private int numCols;
    private double[][] values;


    /**
     * The constructor creates a Matrix. The first parameter is the number of rows. 
     * The second parameter is the number of columns.
     *
     * @param numRows the number of rows
     * @param numCols the number of columns
     */
    public Matrix(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
        this.values = new double[numRows][numCols];
    }

 

    /**
     * This method sets the value in a cell of the matrix. 
     * The first parameter is the row. The second parameter is the column. 
     * If you try to set a value outside of the range of the matrix, a MatrixException is thrown. 
     * Don’t forget negative numbers!
     *
     * @param row the row index
     * @param col the column index
     * @param value the value to set
     * @throws MatrixException if the row or column index is out of range
     */
    public void set(int row, int col, double value) throws MatrixException {
        if (row < 0 || row >= numRows || col < 0 || col >= numCols) {
            throw new MatrixException("Index out of range.");
        }
        values[row][col] = value;
    }
 

   /**
     * //This method gets the value in a cell of the matrix. The first parameter is the row. The second parameter is the column. 
     * If you try to get a value outside the range of the matrix, a MatrixException is thrown. Don’t forget negative numbers!
     *
     * @param row the row index
     * @param col the column index
     * @return the value in the specified cell
     * @throws MatrixException if the row or column index is out of range
     */
    public double get(int row, int col) throws MatrixException {
        if (row < 0 || row >= numRows || col < 0 || col >= numCols) {
            throw new MatrixException("Index out of range.");
        }
        return values[row][col];
    }

 

    /**
     * This is a static method that performs matrix addition on its parameters. This method should return a new Matrix as the answer. 
     * If either Matrix is null, or the matrices cannot be added, a MatrixException should be thrown.
     *
     * @param matrix1 the first matrix to add
     * @param matrix2 the second matrix to add
     * @return the result of matrix addition
     * @throws MatrixException if either matrix is null, or the matrices cannot be added
     */
    public static Matrix add(Matrix matrix1, Matrix matrix2) throws MatrixException {
        if (matrix1 == null || matrix2 == null || matrix1.numRows != matrix2.numRows || matrix1.numCols != matrix2.numCols) {
            throw new MatrixException("Matrices cannot be added.");
        }
        Matrix result = new Matrix(matrix1.numRows, matrix1.numCols);
        for (int i = 0; i < matrix1.numRows; i++) {
            for (int j = 0; j < matrix1.numCols; j++) {
                result.set(i, j, matrix1.get(i, j) + matrix2.get(i, j));
            }
        }
        return result;
    }

 
    /**
     * This is a static method that performs matrix subtraction on its parameters. 
     * This method should return a new Matrix as the answer. 
     * If either Matrix is null, or the matrices cannot be subtracted, a MatrixException should be thrown.
     *
     * @param matrix1 the first matrix to subtract
     * @param matrix2 the second matrix to subtract
     * @return a new matrix that is the result of the subtraction
     * @throws MatrixException if either matrix is null or if the matrices are not the same size
    */
    public static Matrix sub(Matrix matrix1, Matrix matrix2) throws MatrixException {
        if (matrix1 == null || matrix2 == null || matrix1.numRows != matrix2.numRows || matrix1.numCols != matrix2.numCols) {
            throw new MatrixException("Cannot subtract null matrices");
        }
    
        Matrix result = new Matrix(matrix1.numRows, matrix1.numCols);
        for (int i = 0; i < matrix1.numRows; i++) {
            for (int j = 0; j < matrix2.numCols; j++) {
                result.set(i, j, matrix1.get(i, j) - matrix2.get(i, j));
            }
        }
        return result;
    }

    /**
     * Performs matrix multiplication on two matrices.
     * Returns a new Matrix as the answer.
     * Throws a MatrixException if either matrix is null or the matrices cannot be multiplied.
     *
     * @param matrix1 the first matrix
     * @param matrix2 the second matrix
     * @return the product of the two matrices
     * @throws MatrixException if either matrix is null or the matrices cannot be multiplied
    */
    public static Matrix mult(Matrix matrix1, Matrix matrix2) throws MatrixException {
        if (matrix1 == null || matrix2 == null) {
            throw new MatrixException("One or both matrices are null.");
        }
        
        int m1 = matrix1.numRows;
        int n1 = matrix1.numCols;
        int m2 = matrix2.numRows;
        int n2 = matrix2.numCols;
    
        if (n1 != m2) {
            throw new MatrixException("Cannot multiply matrices. Incorrect dimensions.");
        }
        
        Matrix result = new Matrix(m1, n2);
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                double sum = 0;
                for (int k = 0; k < n1; k++) {
                    sum += matrix1.get(i, k) * matrix2.get(k, j);
                }
                result.set(i, j, sum);
            }
        }
        return result;
    }

    /**
     * Performs scalar multiplication on a matrix with a scalar value.
     * Returns a new Matrix as the answer.
     * Throws a MatrixException if the first parameter is null.
     *
     * @param matrix the matrix to be multiplied by the scalar value
     * @param scalar the scalar value to multiply the matrix by
     * @return the product of the matrix and the scalar value
     * @throws MatrixException if the matrix parameter is null
     */
    public static Matrix mult(Matrix matrix, double scalar) throws MatrixException {
        if (matrix == null) {
            throw new MatrixException("Matrix is null.");
        }
        
        int m = matrix.numRows;
        int n = matrix.numCols;
        Matrix result = new Matrix(m, n);
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                double value = matrix.get(i, j) * scalar;
                result.set(i, j, value);
            }
        }
        
        return result;
    }

    /**
     *  This is a static method that performs a matrix transposition on the given parameter.
     *  It should return a new Matrix as the answer. If the parameter is null, a MatrixException should be thrown.
     * 
     * @param matrix The matrix to transpose
     * @return A new Matrix object that is the transpose of the given matrix
     * @throws MatrixException if the given matrix is null
    */
    public static Matrix transpose(Matrix matrix) throws MatrixException {
        if (matrix == null) {
            throw new MatrixException("Cannot transpose a null matrix.");
        }

        int numRows = matrix.numRows;
        int numCols = matrix.numCols;

        Matrix transposedValues = new Matrix(numCols, numRows);

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                transposedValues.set(j, i, matrix.get(i, j));
            }
        }

        return transposedValues;
    }
    //Note: Whenever an exception is thrown, make sure the error message in the exception makes some sort of sense.
    //Note: Row 0, Column 0 should refer to the upper left corner of a matrix.
}
