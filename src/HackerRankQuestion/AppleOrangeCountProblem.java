package HackerRankQuestion;

import java.util.Scanner;

public class AppleOrangeCountProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s  = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();


        int appleSize = sc.nextInt();
        int orangrSize  = sc.nextInt();

        int [] apple = new int[appleSize];
        int [] orange = new int[orangrSize];

        for (int i = 0;i<appleSize;i++){
            apple[i] = sc.nextInt();
        }

        for (int i = 0;i<orangrSize;i++){
            orange[i] = sc.nextInt();
        }


        int appleCount = 0;
        int orangeCount = 0;

        for(int i = 0;i<apple.length;i++){
            int sum  = apple[i] + a;
            if(sum>= s && sum<=t){
                appleCount++;
            }
        }
        for(int i = 0;i<orange.length;i++){
            int sum  = orange[i] + b;
            if(sum>= s && sum<=t){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
