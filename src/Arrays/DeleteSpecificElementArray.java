package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteSpecificElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] num = new int[2 * N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        int elem = 30; // Element to delete
        int pos = -1;

        // Find the position of the element
        for (int i = 0; i < N; i++) {
            if (num[i] == elem) {
                pos = i;
                break;
            }
        }
        System.out.println(pos);

        // If element is found, delete it by shifting
        if (pos != -1) {
            for (int i = pos; i < N - 1; i++) {
                System.out.println(num[i] = num[i + 1]);
                num[i] = num[i + 1];
            }
            num[N - 1] = 0; // Optional: Reset the last element if needed
        } else {
            System.out.println("Element not found.");
        }

        System.out.println(Arrays.toString(num));
    }
}
