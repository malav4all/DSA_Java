package Loops;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 11;
        int i = 1;
        int  j = 0;
        int sum = 0;
        int count  = 0;
        while (i<=n){
            if(n%i ==0){
                System.out.println(i);
                count = count + 1;
            }
            i = i + 1;
        }

//        System.out.println("Count of Divisor" + count);
//        while(j<=count){
//            sum  = sum +j;
//            j = j +1;
//        }
        System.out.println("Sum of divisor" + sum);
        if(count==2){
            System.out.println(n + "prime no");
        }else {
            System.out.println("It is not primeno");
        }


    }
}
