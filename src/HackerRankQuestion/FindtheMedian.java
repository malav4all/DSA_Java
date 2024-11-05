package HackerRankQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class FindtheMedian {
    public static int findMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findMedian(arr));

    }
}
