package TwoArrayDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListIUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrList = new ArrayList<>();
        Integer n  = sc.nextInt();
        for(int i=1;i<=n;i++){
            Integer num = sc.nextInt();
            arrList.add(i);
        }
        for(Integer x:arrList){
            System.out.println(x);
        }
    }
}
