import java.util.Arrays;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int len = matrix.length;
        int[][] dp = new int[len][len];
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) {
            Arrays.fill(dp[i], -1);
        }

        for (int i = 0; i < len; i++) {
            result = Math.min(result, helper(0, i, matrix, dp, len));
        }

        return result;
    }

    public int helper(int row, int col, int[][] matrix, int[][] dp, int len) {
        if (dp[row][col] != -1) return dp[row][col];

        if (row == len - 1) return matrix[row][col];

        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;

        if (col > 0) {
            left = matrix[row][col] + helper(row + 1, col - 1, matrix, dp, len);
        }

        if (col < len - 1) {
            right = matrix[row][col] + helper(row + 1, col + 1, matrix, dp, len);
        }

        middle = matrix[row][col] + helper(row + 1, col, matrix, dp, len);

        dp[row][col] = Math.min(Math.min(left, right), middle);

        return dp[row][col];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        int result = solution.minFallingPathSum(matrix);
        System.out.println("Minimum Falling Path Sum: " + result);
    }
}
