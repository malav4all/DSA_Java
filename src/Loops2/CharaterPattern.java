package Loops2;

public class CharaterPattern {
    public static void main(String[] args) {



        int n = 4;
        for(int i =1;i<=n;i++){
                char val = 'A';
                for(char letter = 1;letter<=i;letter++){
                    System.out.print((char) ((int)(val + i)) + " ");
//                    val = (char) (val + 1);
//                    val += 1;
                }
            System.out.println();
        }
    }
}
