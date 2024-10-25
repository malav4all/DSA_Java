package HackerRankQuestion;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchantProblem {

    public static int sockMerchant(int n, HashMap<Integer,Integer>hashMap) {
        // Write your code here
        System.out.println(hashMap);
        int count = 0;
        for (Integer x:hashMap.values()){
            count += x / 2;
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        HashMap<Integer,Integer>hashMap = new HashMap<>();


        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            int g = hashMap.getOrDefault(arr[i],0);
            hashMap.put(arr[i],g+1);
        }
        System.out.println(sockMerchant(n,hashMap));
    }

}
