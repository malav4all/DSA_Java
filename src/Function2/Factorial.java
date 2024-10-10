package Function2;

public class Factorial {
    public  static  int factorial(int N){
        int ans = 1;
        for (int i = 1;i<=N;i++){
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println(res);
    }
}
