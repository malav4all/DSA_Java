package Loops;

import java.util.Scanner;

public class RangeOfPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range
        System.out.print("Enter start of the range: ");
        int a = sc.nextInt();

        System.out.print("Enter end of the range: ");
        int b = sc.nextInt();

        // Initialize the count of prime numbers
        int count = 0;

        // Start from 'a' and go up to 'b'
        int i = a;
        while (i <= b) {
            if (isPrime(i)) {
                System.out.println(i);  // Print the prime number
                count++;  // Increment the prime count
            }
            i++;  // Move to the next number
        }

        // Print the total count of prime numbers
        System.out.println("Total prime numbers: " + count);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }

        // Check for factors using a while loop
        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                return false;  // If divisible by any number, it's not prime
            }
            i++;
        }
        return true;  // If no factors found, it's prime
    }
}
