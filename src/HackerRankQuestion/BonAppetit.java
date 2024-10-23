package HackerRankQuestion;

import java.util.Scanner;

public class BonAppetit {
    public static void bonAppetit(int[] arr, int k, int b) {
        // Write your code here
        int sum = 0;
        int halfAmount = 0;
        for(int i = 0;i<arr.length;i++){
            arr[k] = 0;
            sum += arr[i];
            halfAmount = sum/2;

        }
        if(halfAmount == b){
            System.out.println("Bon Appetit");
        }else {
            System.out.println(b - halfAmount);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int chargedAmount = sc.nextInt();
        bonAppetit(arr,k,chargedAmount);

    }
}
