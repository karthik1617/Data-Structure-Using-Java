import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} };
        int target = 5;
        int[] ans=searchArray(matrix,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchArray(int[][] matrix, int target) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                if (matrix[rows][cols] == target) {
                    return new int[]{rows, cols};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
