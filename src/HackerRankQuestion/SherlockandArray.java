package HackerRankQuestion;

import java.util.Scanner;

public class SherlockandArray {
    public static String balancedSums(int[] arr){
        int totalSum = 0;
        for(int x:arr){
            totalSum += x;
        }

        int leftSum = 0;
        for(int num:arr){
            totalSum -= num;

            if(leftSum == totalSum){
                return "YES";
            }
            leftSum += num;
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt();


        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j= 0 ;j<n;j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(balancedSums(arr));
        }
    }
}
