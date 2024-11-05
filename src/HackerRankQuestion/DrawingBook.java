package HackerRankQuestion;

import java.util.Scanner;

public class DrawingBook {
    public static int pageCount(int n, int p) {
        // Write your code here
        int front = n/2;
        int back = (n/2) - (p/2);

        return Math.min(front,back);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();


        System.out.println(pageCount(n,p));
    }
}
