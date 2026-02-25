package com.sra.core.exceptions.exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * What you need to build:
 *
 * Take two integers from the user
 * Divide them and print the result
 * Handle ArithmeticException (division by zero)
 * Handle InputMismatchException (user types "abc" instead of a number)
 * Keep looping until valid input is given and division succeeds
 */
public class DivisionCalculator {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            boolean success = false;
            while(!success){
                try {
                    System.out.println("enter dividend");
                    int dividend = Integer.parseInt(sc.nextLine());
                    System.out.println("enter divisor");
                    int divisor = Integer.parseInt(sc.nextLine());
                    int res = dividend / divisor;
                    System.out.println(res);
                    success = true;
                } catch (NumberFormatException e){
                    System.out.println("Input Error: Please enter a whole number");
                } catch (ArithmeticException e){
                    System.out.println("Input Error: Divisor cannot be zero");
                } catch (Exception e) {
                    System.out.println("Input Error: Unknown error");
                    break;
                }
            }
        }
    }
}
