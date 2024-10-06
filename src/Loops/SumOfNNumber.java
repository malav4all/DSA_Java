package Loops;

public class SumOfNNumber {
    public static void main(String[] args) {
        int N = 8;
        int i = 0;
        int ans = 0;
        while (i<=N){
            ans = ans + i;
            i  = i + 1;
        }
        System.out.println(ans);
    }
}
