import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.printf("even");
        }else {
            System.out.printf("odd");
        }
    }
}