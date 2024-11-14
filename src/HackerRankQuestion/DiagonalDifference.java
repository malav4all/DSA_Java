package HackerRankQuestion;

import java.util.Scanner;

public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {
        // Write your code here
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(i == j){
                    leftSum += arr[i][j];
                }
            }
        }

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(i + j == arr.length - 1){
                    rightSum += arr[i][j];
                }
            }
        }


        if(leftSum>rightSum){
            return  leftSum-rightSum;
        }else{
            return rightSum-leftSum;
        }
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        int row = sc.nextInt();
        int [][] arr = new int[row][row];

        for(int i = 0;i<row;i++){
            for (int j = 0;j<row;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(diagonalDifference(arr));

    }
}
