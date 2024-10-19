package TwoArrayClass;

import java.util.Arrays;

public class TwoArrayDemo {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));

        //
        System.out.println();

        for(int i = 0;i<arr.length;i++){
//            System.out.println(Arrays.toString(arr[i]));
            for(int j= 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
