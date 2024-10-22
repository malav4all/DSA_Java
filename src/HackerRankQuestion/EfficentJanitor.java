package HackerRankQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EfficentJanitor {
    public static int efficientJanitor(List<Float> weight) {
        int left = 0, right = weight.size() - 1;
        int trips = 0;

        // Two pointers technique
        while (left <= right) {
            if (weight.get(left) + weight.get(right) <= 3.0) {
                left++; // Pair the lightest with the heaviest
            }
            right--; // The heaviest is always taken
            trips++;
        }
        return trips;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Float> weights = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            weights.add(sc.nextFloat());
        }


        int sum = efficientJanitor(weights);

        System.out.println(sum);
    }
}
