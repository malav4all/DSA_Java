package Strings;

import java.util.Scanner;

public class FindLargestString {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n  = sc.nextInt();
        sc.nextLine();
        int largestLength = 0;
        String largestString = "";
        for(int i =1;i<=n;i++){
            String line  = sc.nextLine();
            if(line.length() > largestLength){
                largestString = line;
                largestLength = line.length();
            }
        }
        System.out.println("Largest String Find:" + largestString);
    }
}
