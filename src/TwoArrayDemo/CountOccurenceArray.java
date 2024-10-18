package TwoArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class CountOccurenceArray {
    public static int [] searchAll(int [] arr,int element){
        int count = 0;
        for(int x:arr){
            if(x== element){
                count++;
            }
        }
        int [] output = new int[count];
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == element){
                output[j] = i;
                j++;
            }
        }
        return  output;
    };
    public static  int [] searchAll2(int [] arr,int element){
        int n = arr.length;
        int [] output = new int[n+1];
        int j = 0;
        for(int i = 0;i<n;i++){
            if(arr[i] ==element){
                output[j] = i;
                j = j  + 1;
            }
        }
        output[j] = -1;
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int occ = sc.nextInt();
        int[] res = searchAll2(arr,occ);
        for(int i = 0;res[i]!=-1;i++){
            System.out.print(res[i] + " ");
        }
//        System.out.println(Arrays.toString(res));
    }
}
