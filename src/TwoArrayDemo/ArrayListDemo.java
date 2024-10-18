package TwoArrayDemo;


// Package where
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // One Creating ArrayList
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        // Insert Middle
        arrList.add(0,5);

        //update
        arrList.set(1,12);

        // get Element in ArrayList
        arrList.get(0);

        // For Each Loop
        for(Integer x:arrList){
            System.out.println(x);
        }

        // Second way
        for(int i = 0;i<arrList.size();i++){
            System.out.println(arrList.get(i));
        }
    }
}
