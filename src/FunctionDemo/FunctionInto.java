package FunctionDemo;

import java.util.Scanner;

public class FunctionInto {

    // Hello Function
    public  static void sayHello(String name){ // function definition
        System.out.println("Hello "+ name);
    }

    // Go Fo Shopping

    public  static  int goShopping(int weight,String item,int money){
        System.out.println("Buying " + weight + "Kg of " + item);
        int unit_price = 25;
        int money_left = money  - (unit_price * weight);
        return money_left;
    }


    // Calaculte Area of circle

    public  static float areaOfCircle(int radius){
        float ans  = (float) Math.PI * radius * radius;
        return ans;
    }


    //Main Function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sayHello(name); // function call
        int money = goShopping(5,"Apple",200);
        System.out.println("Shopping Complete " + money);
        float area = areaOfCircle(20);
        System.out.println("Area of circle " + area);
    }
}
