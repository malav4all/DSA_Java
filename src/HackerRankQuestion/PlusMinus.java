package HackerRankQuestion;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();
        };


        float postiive = 0;
        float negative = 0;
        float zeroSum = 0;

        for(int i = 0;i<N;i++){
            if(arr[i] == 0){
                zeroSum++;
            }else if(arr[i] > 0) {
                    postiive++;
            }else {
                negative ++;
            }
        }
        System.out.printf("%.6f%n", postiive/N);
        System.out.printf("%.6f%n", negative/N);
        System.out.printf("%.6f%n", zeroSum/N);
    }
}
