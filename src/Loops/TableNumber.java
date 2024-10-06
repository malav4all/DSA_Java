package Loops;

import java.util.Scanner;

public class TableNumber {
    public static void main(String[] args) {
        // Print Table

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int i = 1;

        while(i<=10){
            System.out.println(N*i);
            i = i + 1;
        }
        System.out.println("Table end");
    }
}
