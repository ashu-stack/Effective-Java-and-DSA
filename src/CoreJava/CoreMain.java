package CoreJava;

import java.util.*;

public class CoreMain {
    public static void main(String[] args) {
      int[] arr = {12, 3, 6, 1, 6, 9};
     // int miss = missingNumber(arr);
       List<List<Integer>> a = threeSum(arr, 24);

        System.out.println(a);
    }

    public static List<List<Integer>> threeSum(int[] arr, int target) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<n; i++){
            while(i > 0 && arr[i-1]==arr[i]) continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < target){
                    j++;
                }
                else if (sum > target){
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    Collections.sort(temp);
                    set.add(temp);
                    j++;
                    while(j<k && arr[j] == arr[j+1])j++;
                    k--;
                    while(j<k && arr[k] == arr[k+1])k--;
                }
            }
        }

        for(var l : set){
            ans.add(l);
        }

        return ans;
    }


    public static int closest3Sum(int[] arr, int target) {
        int minDiff = Integer.MAX_VALUE;
        int n = arr.length;
        int ans=0;
        for(int i=0; i<n ; i++){
            //if(i>0 && arr[i] == arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                int diff = Math.abs(target - sum);
                // minDiff = Math.min(diff, minDiff);
                if(diff < minDiff) {
                    minDiff = diff;
                    ans = sum;
                    k--;
                }
                else if(diff >= minDiff){
                    j++;
                }
            }
        }
        return ans;
    }


    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int st, int end){
        for(int i=st,j=end; i<j; i++,j--){
            swap(arr, i,j);
        }
    }
    static void nextPermutation(int[] arr) {
        int ind = -1;
        int n = arr.length;
        // code here
        for(int i=n-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                ind = i;
                break;
            }
        }

        if(ind == -1) {
            reverse(arr,0,n-1);
            return;
        }
        for(int i=n-1; i>=ind; i--){
            if(arr[i] > arr[ind]){
                swap(arr, i,ind);
                break;
            }
        }

        reverse(arr, ind+1, n-1);

    }

    static Vector<Integer> addOne(int[] arr) {
        int n = arr.length-1;
        int m = 1;
        int num = 0;
        for(int i=n; i>=0; i--){
            num += arr[i]*m;
            m = m*10;
        }
        num = num+1;
        Vector<Integer> vec = new Vector<Integer>();
        while(num > 0){
            int digit = num%10;
            vec.add(digit);
            num = num/10;
        }
        return vec;
    }


    public static int missingNumber(int[] arr) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            if(i > 0){
                set.add(i);
            }
        }
        int ans = -1;
        for(int i=1; i<=arr.length; i++){
            if(!set.contains(i)){
                ans = i;
                break;
            }
        }
        return ans != -1? ans : arr.length+1;
    }
}
