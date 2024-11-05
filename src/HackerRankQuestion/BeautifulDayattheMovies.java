package HackerRankQuestion;

import java.util.Scanner;

public class BeautifulDayattheMovies {

    public static int reverseNumber(int num){
        int reverse = 0;
        while(num != 0)
        {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num/10;
        }
        return reverse;
    }

    public static int beautifulDays(int a, int b, int k) {
        // Write your code here
        int count = 0;
        for (int i = a; i <= b; i++) {
            int reversed = reverseNumber(i);
            int difference = Math.abs(i - reversed);
            if (difference % k == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();


        System.out.println(beautifulDays(a,b,k));
    }
}
