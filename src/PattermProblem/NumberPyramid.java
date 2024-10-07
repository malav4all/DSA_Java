package PattermProblem;

public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int row=1;row<=n;row++){
            for(int space = 1;space<=n-row;space++){
                System.out.print(" ");
            }
            int val = row;
           for (int num = 1;num<=row;num++){
               System.out.print(val + " ");
               val++;
           }
           val = val - 2;
           for (int count = 1;count<=row-1;count++){
               System.out.print(val + " ");
               val = val -1;
           }
            System.out.println();
        }
    }
}
