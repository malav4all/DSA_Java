package Loops2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div;
        for(div=2;div<n-1;div++){
            if(n%div==0){
                break;
            }
        }
        if(div==n){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}
