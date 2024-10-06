package Loops2;

public class ContinueDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i<=30){
            if(i%7==0){
                i = i+1;
                continue;
            }
            // Skip This work Multiple of 7
            System.out.println(i);
            i= i+1;
        }
    }
}
