// Lab 08 Q 1: Write a java program in which exception is handled if number is divided by zero and print the exception name.

import java.util.Scanner;
import java.lang.Exception;

class zero extends Exception {
    public static void divisible() {
        System.out.println("Number is divisible by zero");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        System.out.println("Enter number to divide by zero: ");
        num = inp.nextInt();

        try {
            if (num / 0 == 0) {
                System.out.println("Number is divisible by zero");
            } else {
                throw new zero();
            }
        } catch (zero z) {
            System.out.println(z.getMessage());
        }

    }

}
