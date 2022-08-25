// Lab 08 03.	Create a new InvalidPasswordFormatException which throws an exception on following scenarios:
// 1)	Password is less than 8 characters.
// 2)	Password has Asterik(*)

import java.util.Scanner;
import java.lang.Exception;

class invalidPasswordFormatException extends Exception {
    public static void lessThan() {
        System.out.println("Your password has less than 8 characters.\n And Your password contain Asterik ( * )");
    }

    public static void asterik() {
        System.out.println(
                "Your password has greater than 8 characters.\n And Your password do not contain Asterik ( * )");
    }
}

class Task3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String password;
        System.out.print("Enter your password: ");
        password = inp.next();

        try {
            if (password.length() < 8) {
                if (password.contains("*")) {
                    throw new invalidPasswordFormatException();
                } else {
                    System.out.println(
                            "Your password has less than 8 characters.\n And Your password do not contain Asterik ( * )");
                }
            } else {
                if (password.contains("*")) {
                    System.out.println(
                            "Your password has greater than 8 characters.\n But Your password contains Asterik ( * )");
                } else {
                    System.out.println(
                            "Your password has greater than 8 characters.\n And Your password do not contains Asterik ( * )");
                }
            }

        } catch (invalidPasswordFormatException abc) {
            abc.lessThan();
        }
    }
}