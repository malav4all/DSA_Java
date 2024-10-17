package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {

    public  static  void printArray(int [] someArray){
        for (int i  = 0;i<someArray.length;i++){
            System.out.print(someArray[i] + ",");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [] arr = new int[N];
//        System.out.print(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr.length);


        // Read N Element,Loop run N times
        for (int i = 0;i<N;i++){
            arr[i] = sc.nextInt(); // Update
        }
        printArray(arr);
    }
}
