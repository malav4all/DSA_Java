package PattermProblem;

public class StarPattern2 {
    public static void main(String[] args) {
        int n = 5;

        for(int row =1 ;row<=n;row++){
            for (int stars =1; stars<=n-row+1; stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
