package Arrays;

import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        // Hard Copy Length
        int[] marks = {10,20,30,40,50};
//        System.out.println(marks.length);
//        System.out.println(marks); // Location of the array in heap memory
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[3]);

      // Update the Array
        marks[2] = 2 * marks[2];

        // Traverse the Way 1 (For Loop) - start and end index, more control over the range
       for(int i = 0;i<marks.length;i++){
            System.out.print(marks[i] + ",");
        }

        System.out.println();
       // For Each loop
       // Traverse the Array way2 Helpful when you want cover enterie array
        int index = 0;
        for (int m:marks){
            System.out.print(m + ",");
            index++;
        }
        System.out.println();

        // traverse the array (way - 3 )
        System.out.println(Arrays.toString(marks));
    }
}
