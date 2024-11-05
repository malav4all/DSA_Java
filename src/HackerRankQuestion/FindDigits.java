package HackerRankQuestion;

import java.util.Scanner;

public class FindDigits {
    public static int findDigits(int number) {
        int count = 0;
        int originalNumber = number;

        while (number > 0) {
            int rem = number % 10;
            if (rem != 0 && originalNumber % rem == 0) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int no = 0;
        for(int i = 0;i<n;i++){
            no = sc.nextInt();
            System.out.println("Output"+ findDigits(no));
        }

    }
}
