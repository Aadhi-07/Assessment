public class add {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] matrix2 = {{2, 6, 1},{3, 8, 4},{7, 2, 0}};
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
