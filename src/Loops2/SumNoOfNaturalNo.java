package Loops2;

import java.util.Scanner;

public class SumNoOfNaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= 0;

        for(int i=1; ;i++){
            System.out.println(i);
            sum =sum+i;
            if(sum>=n){
//                System.out.println(i);
                break;
            }
        }
    }
}