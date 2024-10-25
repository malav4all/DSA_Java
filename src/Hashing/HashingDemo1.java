package Hashing;

import java.util.Scanner;

public class HashingDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i  = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        for(int i = 0;i<q;i++){
            int query  = sc.nextInt();
            int count  = 0;
            for(int j = 0;j<n;j++){
                if(arr[j] == query){
                    count++;
                }
            }
            System.out.println(count);

        }

    }
}
