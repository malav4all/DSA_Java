package HackerRankQuestion;

import java.util.Scanner;

public class ViralAdvertising {
    public static int viralAdvertising(int n) {
       int shared = 0;
       int liked = 0;
       int cummaltive = 0;
       int sum = 0;
       for(int i= 1;i<=n;i++){
           shared = i==1 ? 5 : liked * 3;
           liked = shared/2;
           cummaltive +=liked;
           sum += liked;
       }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(viralAdvertising(n));
    }
}
