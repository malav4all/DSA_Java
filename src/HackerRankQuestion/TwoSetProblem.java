package HackerRankQuestion;

import java.util.Scanner;

public class TwoSetProblem {
    // Helper function to find GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Helper function to find GCD of an array
    public static int gcdArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
            if (result == 1) return 1; // Early termination if GCD becomes 1
        }
        return result;
    }

    // Helper function to find LCM of two numbers
    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    // Helper function to find LCM of an array
    public static int lcmArray(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            result = lcm(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] set1 = new int[n];
        int[] set2 = new int[m];

        for (int i = 0; i < n; i++) {
            set1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            set2[i] = sc.nextInt();
        }

        // Find LCM of the first set
        int lcmSet1 = lcmArray(set1);

        // Find GCD of the second set
        int gcdSet2 = gcdArray(set2);

        // Count integers between the two sets
        int count = 0;
        for (int i = lcmSet1; i <= gcdSet2; i += lcmSet1) {
            if (gcdSet2 % i == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
