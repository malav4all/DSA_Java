package HackerRankQuestion;
import java.util.Scanner;

public class DesignerPDFViewer {

    public static int designerPdfViewer(int[] arr, String word) {
        int maxHeight = 0;

        for(char ch:word.toCharArray()){
            int index = ch - 'a';
            maxHeight = Math.max(maxHeight,arr[index]);
        }

        int area = maxHeight * word.length();
        return  area;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];


        for(int i = 0;i<26;i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();

        String word = sc.nextLine().trim();


        System.out.println(designerPdfViewer(arr,word));

    }
}
