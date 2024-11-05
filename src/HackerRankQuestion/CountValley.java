package HackerRankQuestion;

import java.util.Objects;
import java.util.Scanner;

public class CountValley {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();


        String path = "U D U U U D U D D D";

        int valley=0;
        int level=0;
        for(int i=0; i<8; i++){
            if(path.charAt(i)=='U'){
                level++;
            }else if(path.charAt(i)=='D'){
                if(level==0){
                    valley++;
                }
                level--;
            }
        }
        System.out.println(valley);
    }
}
