package DynamicProgramming.MCM;

import java.util.Collections;

public class PalindromePartioning {
    public static void main(String[] args) {
        String s = "nitin";
        int i=1, j=s.length()-1;
        int ans = partition(s,i,j);
        System.out.println(ans);
    }

    private static int partition(String s, int i, int j) {
        if(i>=j){
            return 0;
        }
        if(isPalindrome(s,i,j)){
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++){
            int temp = partition(s,i,k) + partition(s,k+1,j) + 1;

            ans = Math.min(ans,temp);
        }
        return ans;
    }

    private static boolean isPalindrome(String s, int i, int j) {
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;


    }
}
