import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         if(n % 3 ==0 && n % 10 == 4){
             System.out.println("Yes its");
         }else {
             System.out.println("No Its");
         }
    }
}
