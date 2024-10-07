package PattermProblem;

public class SquareHollow {
    public static void main(String[] args) {
        int N= 5;
        for (int row = 1;row<=N;row++){
            if(row==1||row==N){
                for (int stars = 1;stars<=N;stars++) {
                    System.out.print("*");
                }
                }else{
                    System.out.print("*");
                    for (int spaces = 1;spaces<=N-2;spaces++) {
                        System.out.print(" ");
                    }
                System.out.print("*");
                }
            System.out.println();
            }
        }

}
