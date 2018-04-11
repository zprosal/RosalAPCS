class ExerciseTwo {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                mat[i][j] = [i * 0] + [j * 3];
            }
        }
        reverseMatrix(mat);
    }

    public static int[] reverseRow(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            result[i] = arr.length - i - 1;
        }
        return result;
    }

    public static int[][] reverseMatrix(int [][] mat) {
        int[][] reverse = new int[mat.length][mat.length];
        for(int i = 0; i < mat.length; i++) {
            reverse[i] = mat.length - i - 1;
            for(int j = 0; j < mat[i].length; j++) {
                reverseRow(mat[i]);
            }
            System.out.println(mat[i]);
        }
        return reverse;
    }
}