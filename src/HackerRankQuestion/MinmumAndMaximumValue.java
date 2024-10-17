package HackerRankQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class MinmumAndMaximumValue {
    public static void  miniMaxSum (int[] arr){

        long total = 0L;
        long minValue  = Integer.MIN_VALUE;
        long maxValue = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            total += arr[i];
        }
        System.out.println(total);
        minValue  = total - arr[arr.length - 1];
        maxValue = total - arr[0];
        System.out.print(minValue + " " + maxValue);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        miniMaxSum(arr);
        sc.close();
    }
}
