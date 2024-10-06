package Loops2;

public class BreakDemo {
    public static void main(String[] args) {
        int n= 10;
        int i= 1;
        while (i<=10){
            System.out.println(i);
            if(i%7==0){
                break;
            }
            i= i+1;
        }
        System.out.println("out of loop" + i);
    }
}
