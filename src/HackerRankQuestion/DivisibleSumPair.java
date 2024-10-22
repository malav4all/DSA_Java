package HackerRankQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DivisibleSumPair {
    public static int divisibleSumPairs( int k, List<Integer> ar) {
        int count = 0;
        for(int i = 0;i<ar.size();i++){
            for(int j = i+1;j<ar.size();j++){
                int sum = ar.get(i) + ar.get(j);
                if(sum % k ==0){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>(n);


        for(int i = 0;i<n;i++){
            arr.add(sc.nextInt());
        }

        int k = sc.nextInt();


        System.out.println(divisibleSumPairs(k,arr));
    }
}
