package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class HashingDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        HashMap<Integer,Integer>hashmapArr = new HashMap<>();


        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            int g = hashmapArr.getOrDefault(arr[i],0);
            hashmapArr.put(arr[i],g+1);
        }

        int q = sc.nextInt();
        for(int i =0;i<q;i++){
            int query = sc.nextInt();
            int count= hashmapArr.getOrDefault(query,0);
            System.out.println(count);
        }
    }
}
