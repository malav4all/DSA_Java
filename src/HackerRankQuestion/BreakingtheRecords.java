package HackerRankQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakingtheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> result = new ArrayList<>();
        // Write your code here
        int highCount = 0;
        int lowCount = 0;

        int max = scores.get(0);
        int low = scores.get(0);


        for(int i = 1;i<scores.size();i++){
            if(scores.get(i) > max) {
                highCount++;
                max =scores.get(i);
            }else if(scores.get(i)< low){
                lowCount++;
                low = scores.get(i);
            }
        }
        result.add(highCount);
        result.add(lowCount);
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>(n);


        for(int i = 0;i<n;i++){
            arr.add(sc.nextInt());
        }
        List<Integer>res = breakingRecords(arr);
        for (int x:res)
        {
            System.out.print(x + " ");
        }

    }
}
