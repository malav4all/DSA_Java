package Function2;

public class PascalTriangle {
    public  static  int factorial(int N){
        int ans = 1;
        for (int i = 1;i<=N;i++){
            ans *= i;
        }
        return ans;
    }

    public  static  int binomialCoffieicent(int n,int r){
        return  factorial(n) / (factorial(n-r) * factorial(r));
    }

    public static void main(String[] args) {
    int n = 5;
    for(int i = 0;i<=n;i++){
        for (int j = 0;j<=i;j++){
            System.out.print(" " + binomialCoffieicent(i,j));
        }
        System.out.println();
    }
    }
}
