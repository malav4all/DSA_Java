package HackerRankQuestion;

import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sizes of arrays
        int n = sc.nextInt(); // Size of arr1
        int m = sc.nextInt(); // Size of arr2

        // Input arrays
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Use HashMaps to store frequencies
        HashMap<Integer, Integer> freqBrr = new HashMap<>();
        HashMap<Integer, Integer> freqArr = new HashMap<>();

        // Count frequencies in brr
        for (int num : arr2) {
            freqBrr.put(num, freqBrr.getOrDefault(num, 0) + 1);
        }

        // Count frequencies in arr
        for (int num : arr1) {
            freqArr.put(num, freqArr.getOrDefault(num, 0) + 1);
        }

        // Identify missing numbers
        TreeSet<Integer> missingNumbers = new TreeSet<>();
        for (int num : freqBrr.keySet()) {
            int countBrr = freqBrr.get(num);
            int countArr = freqArr.getOrDefault(num, 0);

            if (countArr < countBrr) {
                missingNumbers.add(num);
            }
        }

        // Output missing numbers
        for (int num : missingNumbers) {
            System.out.print(num + " ");
        }
    }
}
