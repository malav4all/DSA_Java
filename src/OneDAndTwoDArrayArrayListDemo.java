import java.util.Scanner;

public class OneDAndTwoDArrayArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        for(int i =0;i<arr.length;i++){
            for(int j = i;j < arr.length;j++){
                if(arr[i] + arr[j] == element){
                    System.out.print(arr[i] + " " + arr[j] + " ");
                }
            }
        }
    }
}
