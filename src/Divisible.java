import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        // check if its divisble by 3 and its last digit is 4

        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         if(n % 3 ==0 && n % 10 == 4){
             System.out.println("Yes its");
         }else {
             System.out.println("No Its");
         }
    }
}
