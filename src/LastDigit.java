import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int last_digit = a % 10;

        if(last_digit == 4){
            System.out.println("Yes Its");
        }else {
            System.out.println("No Its");
        }

    }
}
