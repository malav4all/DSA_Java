package Loops2;

public class ForDemo {
    public static void main(String[] args) {
        int n = 5;
        int steps = 0;

        // Regualar For loop

        for(steps=0;steps<=n;steps++){
            System.out.println("Walking a step"+ steps);
        }


        //Optional for loop Syntax
//        for ( ; ; ){
//            if(steps == 3){
//                break;
//            }
//            System.out.println("Walking a step"+ steps);
//            steps= steps+1;
//        }
//        System.out.println("Out of Loop" + steps);
    }
}
