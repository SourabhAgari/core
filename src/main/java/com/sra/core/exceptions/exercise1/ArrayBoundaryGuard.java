package com.sra.core.exceptions.exercise1;

import java.util.Scanner;

public class ArrayBoundaryGuard {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Boolean success = false;
        try(Scanner sc = new Scanner(System.in)){
            while(!success){
                try {
                    System.out.println("Enter the index between 0-4 or -1 to exit");
                    int index = Integer.parseInt(sc.nextLine());
                    if(index == -1){
                        success = true;
                    } else {
                        System.out.println(array[index]);
                        success = true;
                    }
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Index is out of bounds please enter index between 0-4");
                } catch (NumberFormatException e){
                    System.out.println("Invalid input please enter a number");
                } catch (Exception e){
                    System.out.println("An unknown error occurred"+e.getMessage());
                }
            }
        }
    }
}
