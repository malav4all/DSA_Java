package PattermProblem;

public class StarPyramid {
    public static void main(String[] args) {
        int N = 5;
        for(int i =1;i<=N;i++){
            //Print Spaces
            for(int spaces = 1;spaces<=N-i;spaces++){
                System.out.print(" ");
            }
            //Print stars
            for (int stars = 1;stars<=2*i-1;stars++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
