import utils.*;

class Example {
    public static void main(String[] args) {
        // sentenceExample();
        // matrixTest1();
        // matrixTest2();
        // matrixTest3();
        matrixTest4();
    }

    public static void sentenceExample() {
        String sentence = SentenceUtil.generateSentence();
        System.out.println(sentence);
    }

    public static void matrixTest1() {
        int[][] mat1 = MatrixUtil.generateRandomMatrix(3,3);
        MatrixUtil.printMatrix(mat1);
    }

    public static void matrixTest2() {
        int[][] mat2 = MatrixUtil.generateRandomMatrix(4,4,1234);
        MatrixUtil.printMatrix(mat2);
    }

    public static void matrixTest3() {
        int[][] mat3 = MatrixUtil.generateRandomMatrix(4,4,1234);
        int[][] mat3r = MatrixUtil.reverseMatrix(mat3);
        MatrixUtil.printMatrix(mat3r);
    }    

    public static void matrixTest4() {
        int[][] mat4 = MatrixUtil.generateRandomMatrix(10,10);
        MatrixUtil.printMatrix(mat4);
        System.out.print("\n");
        int[][] mat4r = mat4;
        for(int i = 0; i < mat4.length; i++) {
            if(i % 2 == 1) {
                mat4r[i] = MatrixUtil.reverseArray(mat4[i]);
            }
        }
        MatrixUtil.printMatrix(mat4r);
    }
}