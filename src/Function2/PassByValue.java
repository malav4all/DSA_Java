package Function2;

// pass By Value -> sending a copy of the data to the function
public class PassByValue {

    public  static  int factorial(int N){
        int ans = 1;
        for (int i = 1;i<=N;i++){
            ans *= i;
        }
        return ans;
    }


    public static int incMoney(int money){
            money = 2 * money;
            return money;
    }

    public  static  int binomialCoffieicent(int n,int r){
        return  factorial(n) / (factorial(n-r) * factorial(r));
    }

    public static void main(String[] args) {
        System.out.println(binomialCoffieicent(5,2));
    }
}
