public class MatrixRunner
{
    public static void main()
    {
        try
        {
            Matrix a = new Matrix(2,2);
            Matrix b = new Matrix(2,2);
            try {
                a.set(0,2,3.8597);
            } catch (MatrixException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Failed Matrix Set Range Test:"+e.getMessage());
            }
            try {
                a.set(-1,0,3.8597);
            } catch (MatrixException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Failed Matrix Set Neg Range:"+e.getMessage());
            }
            a.set(0, 0, 1.1);
            a.set(0, 1, 2.3);
            a.set(1, 0, 0);
            a.set(1, 1, 3.75);
            b.set(0, 0, .25);
            b.set(0, 1, .57);
            b.set(1, 0, -2.3);
            b.set(1, 1, 1.99);
            Matrix c;
            c = Matrix.add(a, b);
            matPrn(c, 2, 2);
            try {
                Matrix.add(null,b);
            } catch (MatrixException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Add: Null Failure: "+e.getMessage());
            }
            try {
                Matrix.sub(null,b);
            } catch (MatrixException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Sub: Null Failure: "+e.getMessage());
            }
            c = Matrix.sub(a, b);
            matPrn(c,2,2);
            c = Matrix.transpose(a);
            matPrn(c,2,2);
            try {
                a.get(2,4);
            } catch (MatrixException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Failed Matrix Get Range:"+e.getMessage());
            }
            try {
                a.get(-1,0);
            } catch (MatrixException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Failed Matrix Get Neg Range:"+e.getMessage());
            }
            c = Matrix.mult(a, 5);
            matPrn(c,2,2);
            a = new Matrix(3, 1);
            b = new Matrix(1, 3);
            a.set(0, 0, 5.5);
            a.set(1, 0, 0);
            a.set(2, 0, 2.2);
            b.set(0, 0, 0);
            b.set(0, 1, 20.22);
            b.set(0, 2, 3.7);
            try {
                Matrix.add(a,b);
            } catch (MatrixException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Add Size Failure " + e.getMessage());
            }
            try {
                Matrix.sub(a,b);
            } catch (MatrixException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Sub Size Failure " + e.getMessage());
            }
            c = Matrix.mult(a,b);
            matPrn(c,3,3);
        } catch (Exception e) {
            System.out.println("General Exception:"+e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void matPrn(Matrix m, int rows, int cols) throws MatrixException
    {
        String s = "";
        for(int x = 0; x < rows; x++)
        {
            for(int y = 0; y < cols; y++)
            {
                s = s + m.get(x, y) + " ";
            }
            System.out.println(s);
            s = "";
        }
    }
}
