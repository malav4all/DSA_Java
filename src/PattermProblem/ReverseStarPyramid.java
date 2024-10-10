package PattermProblem;

public class ReverseStarPyramid {
    public static void main(String[] args) {
        int N = 6;
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
}
