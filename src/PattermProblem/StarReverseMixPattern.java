package PattermProblem;

public class StarReverseMixPattern {
    public static void erectPyramid(int N){

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

    public static void inverted(int N){

        for(int i =1;i<=N;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int j = 0;j<2*N - (2*i+1);j++){
                System.out.print("*");
            }
            for (int j =0; j<i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        erectPyramid(8);
        inverted(8);
    }
}
