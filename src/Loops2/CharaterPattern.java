package Loops2;

public class CharaterPattern {
    public static void main(String[] args) {
        char letter = 'A';
        String letterString = "A";
        System.out.println((char) (letter + 1)); // explict typecast
        System.out.println(letterString + 1);


        int n = 4;
        for(int i =1;i<=n;i++){
                char val = 'A';
                for(letter = 1;letter<=i;letter++){
                    System.out.print(val);
//                    val = (char) (val + 1);
                    val += 1;
                }
            System.out.println();
        }
    }
}
