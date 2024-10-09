package Loops2;

public class Starpattern2 {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++){
            char val = 'A';
            for(int lett = 1;lett<=i;lett++){
                System.out.print(val);
                val +=1;
            }

            for(int j = 1;j<=i;j++){
                val -= 1;
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
