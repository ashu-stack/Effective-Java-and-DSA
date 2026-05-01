package ArraySums;

import java.util.PriorityQueue;

public class ClubBox {
    public static void main(String[] args) {
        int[]arr = {4, 3, 2, 6};
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int el : arr){
            minHeap.add(el);
        }

        int totalCost = 0;

        /*
        2
        3
        4
        5
        6
         */

        while(minHeap.size() >= 2){

            int a = minHeap.remove();
            int b = minHeap.remove();

            System.out.println(" a : " + a + "   b: " + b);
            int sum = a+b;
            minHeap.add(sum);
            totalCost += sum;

        }

        //int k = minHeap.remove();

        String s = "Ashu";



        System.out.println("Minimum cost : " + totalCost);
    }
}
