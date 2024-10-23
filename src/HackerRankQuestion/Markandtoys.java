package HackerRankQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Markandtoys {
    public static int maximumToys(int [] arr, int k) {
        // Write your code here
        int count = 0;
        long sum = 0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            if(sum < k){
                count ++;
            }
        }
       return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr);
        System.out.println(maximumToys(arr,k));

    }
}
