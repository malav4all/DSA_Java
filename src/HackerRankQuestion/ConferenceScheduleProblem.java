package HackerRankQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class ConferenceScheduleProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Reading start and end times of the presentations
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            end[i] = sc.nextInt();
        }

        // Create an array of presentation intervals and sort by end times
        int[][] presentations = new int[n][2];
        for (int i = 0; i < n; i++) {
            presentations[i][0] = start[i]; // start time
            presentations[i][1] = end[i];   // end time
        }
        System.out.print(Arrays.toString(presentations));

        // Sort presentations by their end times (second column)
        Arrays.sort(presentations, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int lastEndTime = -1; // Initialize with a time that doesn't interfere

        // Iterate over presentations and count the maximum number of non-overlapping presentations
        for (int i = 0; i < n; i++) {
            if (presentations[i][0] >= lastEndTime) {
                count++;
                lastEndTime = presentations[i][1]; // Update the last end time
            }
        }

        System.out.println(count);
    }
}
