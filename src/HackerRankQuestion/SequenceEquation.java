package HackerRankQuestion;

import java.util.HashMap;
import java.util.Scanner;

public class SequenceEquation {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> arrValue = new HashMap<>();

        for(int i = 0;i<n;i++){
            int value  = sc.nextInt();
            arrValue.put(value,i);
        }
        System.out.println(arrValue);

//        for(int i = 0;i<n;i++){
//            int x =
//        }

    }
}
