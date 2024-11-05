package HackerRankQuestion;

import java.util.Scanner;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int max = -1;

        for (int i = 0;i<keyboards.length;i++){
            for(int j = 0;j<drives.length;j++){
                if(keyboards[i] + drives[j] <= b){
                    max = Math.max(max,keyboards[i]+drives[j]);
                }
            }
           if(max > b){
             return -1;
           }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int keyboardInput = sc.nextInt();
        int usbInput = sc.nextInt();

        int[] keyboard  = new int[keyboardInput];
        int[] usbArr = new int[usbInput];

        for(int i = 0;i<keyboardInput;i++){
            keyboard[i] = sc.nextInt();
        }

        for (int  i = 0;i<usbInput;i++){
            usbArr[i] = sc.nextInt();
        }


        System.out.println(getMoneySpent(keyboard,usbArr,b));;

    }
}
