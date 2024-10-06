package Loops2;

import java.util.Scanner;

public class MultipleInput {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            int num= sc.nextInt();
            int sum= 0;
            for(;num>0;num=num/10){
                sum = sum + num/10;
            }
            System.out.println(sum);
        }
    }
}
