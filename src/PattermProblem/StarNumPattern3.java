package PattermProblem;

public class StarNumPattern3 {
    public static void main(String[] args) {
        int n  = 5;
        int val = 1;
        for (int row = 1; row<=n;row++){
            for(int stars = 1;stars<=row;stars++){
                System.out.print(val);
                val++;
            }
            System.out.println();
        }
    }
}
