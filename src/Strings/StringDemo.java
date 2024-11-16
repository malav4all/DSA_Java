package Strings;

import java.util.Scanner;

public class StringDemo {
    public static void stringBasic(){
        String a = "hello";
        String b = "hello";
        String c = b;
        if(a==b && b==c&& a==c){
            System.out.println("Equal");
        }else {
            System.out.println("NOt Equal");
        }


        System.out.println(a);
        System.out.println(a.length());

        // One MOre way
        // Different Object are created that why ans is not Equal
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        if(s1==s2){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Hello"));

        // Immuatbale ,string can't be modifed

        System.out.println(s1.charAt(0));
        // Char Array
        char arr[] = s1.toCharArray(); // Copy of String inside array but actual string update
        arr[0] = 'B';
        System.out.println(arr);
        System.out.println(s1);

        s1 = new String(arr);
        System.out.println(s1);
    }
    public static void readInput(){

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        // Consume First Enter
        sc.nextLine();

        for(int i=1;i<=n;i++){
            String line = sc.nextLine();
            System.out.println(line
            );
        }
        /*
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        System.out.println(firstName);
        System.out.println(lastName);

        // Reading Whole Line one time It looks Enter
        sc.nextLine();
        String line = sc.nextLine();
        System.out.println(line.stripLeading());
         */
    }
}
