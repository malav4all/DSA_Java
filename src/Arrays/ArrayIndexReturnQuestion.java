package Arrays;

import java.util.Scanner;

public class ArrayIndexReturnQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] num = new int[N];
        for (int i  =  0;i<N;i++){
            num[i] = sc.nextInt();
        }


//        int element = sc.nextInt();
        for (int i = 0;i<num.length;i++){
            if(num[i] == 15){
                System.out.print(i);

            }
        }
    }
}
