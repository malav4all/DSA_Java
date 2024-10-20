package HackerRankQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleOrangeCountUsingArrayList {
    public  static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
        int appleCount = 0;
        int orangeCount = 0;

        for(int x:apples){
            int sum = x + a;
            if(sum>= s && sum<=t){
                appleCount++;
            }
        }

        for(int x:oranges){
            int sum = x + b;
            if(sum>= s && sum<=t){
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int s = sc.nextInt();
         int t = sc.nextInt();

         int a = sc.nextInt();
         int b = sc.nextInt();

         int appleSize = sc.nextInt();
         int orangeSize = sc.nextInt();

         List<Integer> apple = new ArrayList<>();
         for(int i = 0;i<appleSize;i++){
             apple.add(sc.nextInt());
         }
         List<Integer> orange = new ArrayList<>();
         for(int i = 0;i<orangeSize;i++){
             orange.add(sc.nextInt());
         }
        countApplesAndOranges(s,t,a,b,apple,orange);
    }
}
