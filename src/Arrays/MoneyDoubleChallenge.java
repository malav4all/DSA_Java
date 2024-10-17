package Arrays;

import java.util.Arrays;

public class MoneyDoubleChallenge {
    public static  void moneydouble(int[] money){
        for (int i = 0;i<money.length;i++){
            money[i] = 2  * money[i];
        }
    }
    public static void main(String[] args) {
        int[] friend_money = {10,20,30};
        System.out.println(Arrays.toString(friend_money));
        moneydouble(friend_money);
        System.out.println(Arrays.toString(friend_money));
    }
}
