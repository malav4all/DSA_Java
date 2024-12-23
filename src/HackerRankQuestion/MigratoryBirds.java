package HackerRankQuestion;

import java.util.HashMap;
import java.util.Scanner;

public class MigratoryBirds {
    public static int migratoryBirds(HashMap<Integer,Integer>hashMap) {
        // Write your code here
        int max =  0;
        int count = 0;
        for (Integer key:hashMap.keySet()){
            int val = hashMap.get(key);
            if(val > max){
                max = val;
                count = key;
            }

        }
       return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[] arr = new int[n];
        HashMap<Integer,Integer>hashMap = new HashMap<>();


        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            int g = hashMap.getOrDefault(arr[i],0);
            hashMap.put(arr[i],g+1);
        }

        System.out.println(migratoryBirds(hashMap));



    }
}
