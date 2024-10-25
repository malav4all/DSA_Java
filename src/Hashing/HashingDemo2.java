package Hashing;

import java.util.Scanner;

public class HashingDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] hashArr = new int[51];


        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            hashArr[arr[i]] = hashArr[arr[i]]+1;
        }

        int q = sc.nextInt();
        for(int i =0;i<q;i++){
            int query = sc.nextInt();
            int count= hashArr[query];
            System.out.println(count);
        }
    }
}
