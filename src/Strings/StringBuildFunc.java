package Strings;

public class StringBuildFunc {
    public static void main(String[] args) {
        String s1 = "i love mangoshake";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
        s1= s1.toLowerCase();
        System.out.println(s1);
        s1  = s1.replace("mango","apple");
        System.out.println(s1);

        //Remove White Space
        String name = "         Malav     ";
        System.out.println(name.length());
        System.out.println(name.strip());
        System.out.println(name.strip().length());
    }
}
