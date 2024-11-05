package HackerRankQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class HackerLandUniversityGradeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] output = new int[arr.length];
        int j = 0;

        for(int i = 0;i<arr.length;i++){
             if (arr[i] < 38) {
                output[j] = arr[i];
            }else {
                 int roundNo = Math.round((arr[i] + 4) / 5.0f) * 5;
                 int diff =  roundNo - arr[i];
                 System.out.print(diff);
                 System.out.print(diff < 3);
                 if(diff < 3){
                     output[j] = roundNo;
                 }else {
                     output[j] = arr[i];
                 }
                 j++;
             }
        }

        System.out.printf(Arrays.toString(output));
    }
}
