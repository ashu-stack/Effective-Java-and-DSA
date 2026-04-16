package DynamicProgramming.MCM;
import java.util.Arrays;
public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int[] arr = {40,20,30,10,30};
        int n = arr.length;
        int i=1, j=n-1;

        int[][] dp = new int[101][101];

        for (int[] ints : dp) {
            Arrays.fill(ints, -1);
        }

        int cost = solveMatrix(arr,dp,i,j);
        System.out.println(cost);
    }

    private static int solveMatrix(int[] arr,int[][] dp, int i, int j) {
        if(i >= j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;
        for(int k=i; k<=j-1;k++){
            int tempAns = solveMatrix(arr,dp,i,k) + solveMatrix(arr, dp,k+1, j)
                        + arr[i-1] * arr[k] * arr[j];
            min = Math.min(tempAns,min);
        }
        dp[i][j] = min;
        return dp[i][j];
    }
}
