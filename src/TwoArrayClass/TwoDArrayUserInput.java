package TwoArrayClass;

import java.util.Scanner;

public class TwoDArrayUserInput {
    public static void printArray(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + ",");
            for(int j= 0;j<arr[i].length;j++){
                System.out.print(arr[j]+ " ");
            }
            System.out.println();
        }
    }

    public static int[][] createUserInputArray(){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void waveOrderPrint(int [][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        for(int col= 0;col<cols;col++){
            if(col % 2 == 0){
                for(int row =0;row<rows;row++){
                    System.out.print(arr[row][col]);
                }
            }else {
                for(int row =rows-1;row>0;row--){
                    System.out.print(arr[row][col]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][] res = createUserInputArray();
        waveOrderPrint(res);
    }
}
