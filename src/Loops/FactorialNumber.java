package Loops;

public class FactorialNumber {
    public static void main(String[] args) {
        int N = 6;
        int ans   = 1;
        int i = 1;
        while (i<=N){
            ans = ans * i;
            i = i + 1;
        }
        System.out.println(ans);
    }
}
