package Loops2;

public class Problems {
    public static void main(String[] args) {
        int n = 2356;
        int digits = 0;
    int sum =0;
//        while(n>0){
//            digits = digits +1;
//            sum =sum+ n%10;
//            n = n/10;
//        }
//        System.out.println(digits);
//        System.out.println(sum);


        // for loop
        for(;n>0;n=n/10){
            digits++;
            sum = sum + n % 10;
        }
        System.out.println(digits);
        System.out.println(sum);


        // Find Sum

    }
}
