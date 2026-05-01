package Maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MathsClass {
    public static void main(String[] args) {
        int n = 47;
        boolean prime = isPrime(n);

        Stack <Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        List<Integer> list2 = list.reversed();
        System.out.println(list2);
        System.out.println(prime);
    }

    private static boolean isPrime(int n) {
        if(n <= 1) return false;

        int c=2;
        while(c*c <= n){
            if(n%c == 0) return false;
            c++;
        }
        return true;
    }
}
