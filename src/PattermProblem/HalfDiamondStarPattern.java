package PattermProblem;

public class HalfDiamondStarPattern {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n ||
                        (i == 2 && (j <= 4 || j >= 6)) ||
                        (i == 3 && (j <= 3 || j >= 7)) ||
                        (i == 4 && (j == 1 || j == n)) ||
                        (i == 5 && (j == 1 || j == n)) ||
                        (i == 6 && (j <= 3 || j >= 7)) ||
                        (i == 7 && (j <= 4 || j >= 6)) ||
                        (i == 8 && (j <= n))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
