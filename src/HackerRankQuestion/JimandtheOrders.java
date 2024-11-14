package HackerRankQuestion;

import java.util.*;

public class JimandtheOrders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] order = new int[n];
        int []prep = new int[n];

        for(int i = 0;i<n;i++){
            order[i] = sc.nextInt();
            prep[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> has = new HashMap<>();

        int [] deliveryTime = new int[n];
        for(int i = 0;i<n;i++){
            int sum = order[i] + prep[i];
            deliveryTime[i] = sum;
            has.put(sum,i+1);
        }

        Arrays.sort(deliveryTime);
        for(int i = 0;i<n;i++){
            int val = deliveryTime[i];
            System.out.print(has.get(val) + " ");
        }
    }
}
