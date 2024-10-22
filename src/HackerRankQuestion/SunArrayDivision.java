package HackerRankQuestion;

import java.util.*;

public class SunArrayDivision {
    public static int countSegments(int[] s, int d, int m) {
        int count = 0;

        // Loop through the chocolate bar array
        for (int i = 0; i <= s.length - m; i++) {
            int sum = 0;

            // Sum the subarray of length `m`
            for (int j = 0; j < m; j++) {
                sum += s[i + j];
            }

            // Check if the sum matches Ron's birth day
            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] s = {1,1,1,1,1,1};
        int d = 4;  // Ron's birth day
        int m = 1;  // Ron's birth month

        int result = countSegments(s, d, m);
        System.out.println("Number of valid segments: " + result);
    }
}
