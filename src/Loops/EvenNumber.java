package Loops;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;

        while (i<= N){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i =  i+ 1;
        }
        System.out.println("Out fo loop");



        // another Way to do this

        int  j = 2;
        while(j<=N){
            System.out.println(j);
            j = j + 2;
        }

        System.out.println("out of Loop");
    }
}
