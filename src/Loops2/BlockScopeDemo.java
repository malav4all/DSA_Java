package Loops2;

public class BlockScopeDemo {
    public static void main(String[] args) {
        int x;
        if(true){
             x= 10;
            System.out.println("Inside if" +x);
        }
        System.out.println("ouside x" + x);
    }
}
