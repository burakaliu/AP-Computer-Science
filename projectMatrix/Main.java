import javax.sound.midi.Soundbank;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        MatrixRunner matrixRunner = new MatrixRunner();
        matrixRunner.main();

        System.out.println("\n\n\n\n\n\n");

        SparseMatrixRunner sparseMatrixRunner = new SparseMatrixRunner();
        sparseMatrixRunner.main();
    }
}
