package Loops;

import java.util.Scanner;

public class SumOfNNumberPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i  = 0;
        int sum = 0;
        while (i<=n){
            int no = sc.nextInt();
            sum =sum + no;
            i = i+ 1;
        }
        System.out.println(sum);



    }
}
