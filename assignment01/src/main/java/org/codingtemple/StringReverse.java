package org.codingtemple;

import java.util.Scanner;

public class StringReverse {

    public void run() {
        //Scanner to get user input
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to String Reverse Challenge!");
        System.out.println("Enter a sentence: ");

        String[] split = input.nextLine().trim().split(" ");
        StringBuilder sentence = new StringBuilder();
        StringBuilder reverse;
        for (int i = 0; i < split.length; i++) {
            reverse = new StringBuilder(split[i]);//helper to reverse individual string before appending to sentence string
            sentence.append(reverse.reverse()).append(" ");
        }

        System.out.println("Modified sentence: \n" + sentence);
    }
}
