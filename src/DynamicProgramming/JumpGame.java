package DynamicProgramming;
import java.util.Arrays;
public class JumpGame {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int[] dp = new int[nums.length+1];
        Boolean a ;
        Arrays.fill(dp,-1);
        int ans = getJumps(nums, 0,dp);
        System.out.println(ans);

    }

    private static int getJumps(int[] nums, int ind, int[] dp) {
        if(ind >= nums.length-1){
            return 0;
        }
        if(dp[ind] != -1){
            return dp[ind];
        }
        int jumps=Integer.MAX_VALUE;
        for(int i=1; i<=nums[ind] ; i++){
            if(ind+i< nums.length) {
                jumps = Math.min(jumps, 1 + getJumps(nums, ind + i, dp));
            }
        }
        dp[ind] = jumps;
        return dp[ind];
    }
}
