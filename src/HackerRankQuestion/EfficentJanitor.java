package HackerRankQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class EfficentJanitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] weights = new float[n];

        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextFloat();
        }

        // Sort the array to use two pointers approach
        Arrays.sort(weights);
        int left = 0, right = n - 1;
        int trips = 0;

        // Two pointers technique
        while (left <= right) {
            if (weights[left] + weights[right] <= 3.0) {
                left++; // Pair the lightest with the heaviest
            }
            right--; // The heaviest is always taken
            trips++;
        }

        System.out.println(trips);
    }
}
