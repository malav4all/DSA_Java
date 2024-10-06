package Loops2;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        //Jugaad Method
//        for(;n>0;n=n/10){
//            System.out.print(n%10);
//        }

        // Actual Reverse a no
        int sum = 0;
        for(;n>0;n = n/10){
            sum = sum *10 + n%10;
        }
        System.out.println(sum);
    }
}
