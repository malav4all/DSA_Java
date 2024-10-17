package HackerRankQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCake {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();
        };
//        Arrays.sort(arr, (a, b) -> b - a);
        int count = 0;
        int maxElement = arr[0];
        for(int i = 0;i<arr.length;i++){
           if(arr[i] > maxElement){
               maxElement = arr[i];
               count = 1;
           }else if(arr[i] == maxElement){
               count++;
           }
        }
        System.out.println(count);


    }
}
