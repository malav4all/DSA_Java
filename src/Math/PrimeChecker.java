package Math;

import java.util.Scanner;

public class PrimeChecker {
    public static  boolean isPrimeNumber(int n){
        for(int i =2;i *i<=n;i++){
            if(n%i==0){
                return  false;
            }
        }
        return true;
    }
    public static void printPrimes(int A,int B){
        for(int i =A;i<=B;i++){
            if(isPrimeNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
    //Find The Sum of Divisor of a number
    public static int sumDivisor(int n){
        int sum = 0;
        for(int i =1;i*i<=n;i++){
            if(n%i==0){
                if(i*i ==n){
                    sum =sum+i;
                }else {
                    sum =sum +i+n/i;
                }
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();
//        printPrimes(n,m);
        System.out.println(sumDivisor(n));
    }
}
