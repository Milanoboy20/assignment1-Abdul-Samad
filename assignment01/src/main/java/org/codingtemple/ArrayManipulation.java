package org.codingtemple;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulation {
    public void run() {
        //Initialize and set new array to 5, since we are only getting 5 user inputs
        Integer[] numbers = new Integer[5];

        //Scanner to get user input
        Scanner input = new Scanner(System.in);

        System.out.println("Hello and Welcome to Array Manipulation Challenge!");

        //1. Prompt user for input, 5 integers
        for (int i = 0; i < numbers.length; i++){
            String num;
            do {
                System.out.println("Enter a valid Integer: ");
                num = input.nextLine();
            } while (!num.matches("^-?[0-9]+$"));

            numbers[i] = Integer.parseInt(num);
        }

        //2. Reverse the array and print
        Collections.reverse(Arrays.asList(numbers));
        System.out.println("\nReversed array: " + Arrays.asList(numbers));

        //3. Find the maximum and minimum values
        Arrays.sort(numbers);
        System.out.println("\nMaximum value: " + numbers[numbers.length - 1]);
        System.out.println("Minimum value: " + numbers[0]);

        //4. Sum of numbers in the array
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("\nSum of numbers in the array: " + sum);

        //5. check for even number
        if (!checkEven(numbers)) {
            System.out.println("This array does not contain an even number!");
        }
    }

    private static boolean checkEven(Integer[] numbers) {
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                System.out.println("This array contains an even number: " + numbers[i]);
                return true;// need only first instance
            }
        }
        return false;
    }
}
