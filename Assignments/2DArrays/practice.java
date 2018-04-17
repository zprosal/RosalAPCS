class practice {
    public static void main(String[] args) {
    // 1.
        int[][] mat1 = new int[3][3];
        int num1 = 2;
        for(int i = 0; i < mat1.length; i++) {
            for(int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = num1;
                num1 *= j + 2;
            }
        }
        printMatrix(mat1);
    }

    public static void printMatrix(int[][] matrix) {
        for(int[] row : matrix) {
            for(int col : row) {
                System.out.print(col + " ");
            }
            System.out.print("\n");
        }
    }
}