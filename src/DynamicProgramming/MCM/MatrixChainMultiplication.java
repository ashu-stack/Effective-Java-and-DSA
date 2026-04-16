package DynamicProgramming.MCM;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int[] arr = {40,20,30,10,30};
        int n = arr.length;
        int i=1, j=n-1;

        int cost = solveMatrix(arr,i,j);
        System.out.println(cost);
    }

    private static int solveMatrix(int[] arr, int i, int j) {
        if(i >= j){
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for(int k=i; k<=j-1;k++){
            int tempAns = solveMatrix(arr,i,k) + solveMatrix(arr, k+1, j)
                        + arr[i-1] * arr[k] * arr[j];
            min = Math.min(tempAns,min);
        }
        return min;
    }
}
