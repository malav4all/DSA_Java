package HackerRankQuestion;

import java.util.Scanner;

public class CatAndMouse {
    static String catAndMouse(int x, int y, int z) {
        int disA = Math.abs(z - x);
        int disB = Math.abs(z - y);

        if (disA < disB) {
            return "Cat A";
        } else if (disB < disA) {
            return "Cat B";
        } else {
            return "Mouse C";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(catAndMouse(x, y, z));
        }
        sc.close();
    }
}
