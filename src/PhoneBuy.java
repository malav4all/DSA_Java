import java.util.Scanner;

public class PhoneBuy {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int price = sc.nextInt();
        int budget = sc.nextInt();
        boolean isSaleActive = sc.nextBoolean();
        if(budget >= price  && isSaleActive){
            System.out.println("Lets buys Phone");
        }else {
            System.out.printf("Wait for sale");
        }
    }
}
