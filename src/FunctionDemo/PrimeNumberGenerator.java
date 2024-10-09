package FunctionDemo;

public class PrimeNumberGenerator {
    // Given a number, check if its is Prime(Boolean)
    public  static boolean isPrimeNumber(int num){
       for(int i =2;i<num-1;i++){
           if(num % i ==0){
               return  false;
           }
       }
       // Out of loop -> no divisor find
        return true;
    }
    // give two Number A & B Print all Prime [A,B]
    public  static  void genratePrimeNumber(int a,int b){
        for(int i = a;i<=b;i++){
            if(isPrimeNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        genratePrimeNumber(10,20);
    }
}
