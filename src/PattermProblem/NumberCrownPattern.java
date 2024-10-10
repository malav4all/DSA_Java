package PattermProblem;

public class NumberCrownPattern {
    public static void main(String[] args) {
        int n = 6;
        int spaces = 2 * (n - 1);
        for (int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j = i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;
        }
    }
}
