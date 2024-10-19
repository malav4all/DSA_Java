package HackerRankQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankUniversityGradeProblemUsingList {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> res = new ArrayList<>();

        for(Integer result:grades){
            if(result < 38){
                res.add(result);
            }else {
                int roundNo = (result  + 4) / 5 * 5;
                int diff = roundNo - result;
                if(diff < 3){
                    res.add(roundNo);
                }else {
                    res.add(result);
                }
            }
        }

            return res;
    };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> arrList = new ArrayList<>(n);

        for (int i = 0;i<n;i++){
            arrList.add(sc.nextInt());
        }

        List<Integer> result = gradingStudents(arrList);
        for(int res:result){
            System.out.println(res);
        }
    }
}
