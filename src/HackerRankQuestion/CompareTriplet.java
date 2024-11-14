package HackerRankQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTriplet {
    public static List<Integer> compareTriplets(int[] a, int[] b) {
        List<Integer> arr = new ArrayList<>();
        int alaias = 0;
        int blob = 0;
        for(int i = 0;i<3;i++){
            if(a[i] > b[i]){
                alaias++;

            }else  if (a[i] < b[i]) {
                blob++;

            }
        }
        arr.add(alaias);
        arr.add(blob);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        for(int i =0;i<3;i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0;i<3;i++){
            b[i] = sc.nextInt();
        }
        List<Integer>arr = compareTriplets(a,b);
        for(Integer x:arr){
            System.out.print(x + " ");
        }
    }
}
