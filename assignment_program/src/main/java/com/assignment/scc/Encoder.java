package com.assignment.scc;

import java.util.Scanner;

public class Encoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to encode: ");
        String input = scanner.nextLine();
        String encodedString = encode(input);
        System.out.println("Encoded string: " + encodedString);
        scanner.close();

        }

        protected static String encode(String str) {
        if(str == null || str.isEmpty())
            return "";

            StringBuilder encoded = new StringBuilder();
            int count = 1;
            char prevChar = str.charAt(0);

            for (int i = 1; i < str.length(); i++) {
                char currentChar = str.charAt(i);
                if (currentChar == prevChar) {
                    count++;
                } else {
                    encoded.append(prevChar).append(count);
                    prevChar = currentChar;
                    count = 1;
            }

            }
            encoded.append(prevChar).append(count);

            return encoded.toString();
        }

}