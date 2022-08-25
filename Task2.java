// Lab 08 Q2.	Write a java program in which takes an input from the user if his/her age is less than 18 then 
// throw an user defined exception./ User defined exception class must include two methods of eligible 
//  not eligible.

import java.util.Scanner;
import java.lang.Exception;

class Age extends Exception {
    public static void eligible() {
        System.out.println("Age is greater than 18, You are eligible");
    }

    public static void notEligible() {
        System.out.println("Age is less than 18, You are not eligible");
    }
}

class Task2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = inp.nextInt();

        try {
            if (age < 18) {
                throw new Age();
            } else {
                System.out.print("You are Eligible");
            }
        } catch (Age tes) {
            tes.notEligible();
        }
    }
}