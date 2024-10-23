package HackerRankQuestion;

import java.util.Scanner;

public class UtopianTree {
    public static int utopianTree(int n) {
        int h = 0;
       for(int i = 0;i<=n;i++){
           if(i == 0){
               h = 1;
           }else if(i % 2 == 0){
               h += 1;
           }else {
               h *= 2;
           }
       }
       return  h;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];


        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<arr.length;i++){
            int sum = utopianTree(arr[i]);
            System.out.println(sum);
        }
    }
}
