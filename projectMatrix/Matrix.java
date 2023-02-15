public class Matrix {
    

    Matrix (int a, int b){
        public double graph[][] = new double[a][b];
    } //The constructor creates a Matrix. The first parameter is the number of rows. The second parameter is the number of columns.

 

    public static void set (int a, int b, double c){
    
    }//This method sets the value in a cell of the matrix. The first parameter is the row. The second parameter is the column. If you try to set a value outside of the range of the matrix, a MatrixException is thrown. Don’t forget negative numbers!

 

    public static void get (int a, int b){

    } //This method gets the value in a cell of the matrix. The first parameter is the row. The second parameter is the column. If you try to get a value outside the range of the matrix, a MatrixException is thrown. Don’t forget negative numbers!

 

    public static void add (Matrix a, Matrix b){

    } //This is a static method that performs matrix addition on its parameters. This method should return a new Matrix as the answer. If either Matrix is null, or the matrices cannot be added, a MatrixException should be thrown.

 

    public static void sub (Matrix a, Matrix b){

    } //This is a static method that performs matrix subtraction on its parameters. This method should return a new Matrix as the answer. If either Matrix is null, or the matrices cannot be subtracted, a MatrixException should be thrown.

 

    public static void mult (Matrix a, Matrix b){

    } //This is a static method that perfoms matrix multiplication on its parameters. This method should return a new Matrix as the answer. If either Matrix is null, or you cannot multiply the matrices, a MatrixException should be thrown.

 

    public static void mult (Matrix a, double b){
        
    } //This is a static method that performs scalar multiplication. This method should return a new Matrix as the answer. If the first parameter is null, a MatrixException should be thrown.

 

    public static void transpose (Matrix a){

    } //This is a static method that performs a matrix transposition on the given parameter. It should return a new Matrix as the answer. If the parameter is null, a MatrixException should be thrown.
    //Note: Whenever an exception is thrown, make sure the error message in the exception makes some sort of sense.
    //Note: Row 0, Column 0 should refer to the upper left corner of a matrix.
}
