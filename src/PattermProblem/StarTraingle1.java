package PattermProblem;

public class StarTraingle1 {
    public static void main(String[] args) {
        int n  = 5;
        for (int row = 1; row<=n;row++){
            for(int stars = 1;stars<=row;stars++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
