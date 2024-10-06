package Loops;

import java.util.Scanner;

public class PowerAB {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();

        int  i = 1;
        int ans  = 1;
        while(i<=b){
            ans = ans * a;
            System.out.println(ans);
            i = i + 1;
        }
        System.out.println(ans);
    }
}
