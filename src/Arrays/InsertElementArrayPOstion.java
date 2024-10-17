package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementArrayPOstion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] num = new int[2 * N];
        for (int i  =  0;i<N;i++){
            num[i] = sc.nextInt();
        }

        int pos = 3;
        int elem = 30;
        for(int i = N - 1 ;i>=pos - 1 - 1;i--){
          num[i+1]  =  num[i];
        }
        num[pos - 1] = elem;
        System.out.println(Arrays.toString(num));
    }
}
