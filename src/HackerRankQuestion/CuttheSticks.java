package HackerRankQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class CuttheSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sticksRemaining = n;
        int i = 0;

        while (i < n) {
            System.out.println(sticksRemaining);
            int currentLength = arr[i];
            while (i < n && arr[i] == currentLength) {
                i++;
            }
            sticksRemaining = n - i;
        }
    }
}
