package HackerRankQuestion;

import java.util.Scanner;

public class HurdleRace {
    public static int hurdleRace(int k, int[] height) {
        int max = height[0];
        for(int i = 0;i<height.length;i++){
            if(height[i] > max){
                max =height[i];
            }
        }

        int calcHeight = max - k;
        int sum= k > max ? 0 : calcHeight;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n =  sc.nextInt();
        int k =sc.nextInt();

        int[] height = new int[n];
        for(int i = 0;i<n;i++){
            height[i] = sc.nextInt();
        }
        System.out.println(hurdleRace(k,height));
    }
}
