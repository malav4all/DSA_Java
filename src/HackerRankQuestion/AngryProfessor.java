package HackerRankQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class AngryProfessor {
    public static String angryProfessor(int k, int[] arr) {
        String t = "NO";
        if(arr.length - k == 0){
            return "YES";
        }else {
            for(int i = 0;i<arr.length - k;i++){
                if(arr[i] <= 0){
                    t =  "YES";
                }else {
                    t =  "NO";
                }
            }
        }
        return t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(angryProfessor(k,arr));
        }
    }
}
