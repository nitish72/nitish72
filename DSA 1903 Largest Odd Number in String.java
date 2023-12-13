package com.Daily_Leetcode_Challenges;

public class DSA_1903_Largest_Odd_Number_in_String {

        public static void main(String[] args) {
            String s = "123456";
            System.out.println(largestOddNumber(s)); // Output: 5
        }

        public static String largestOddNumber(String num) {
            for (int i = num.length() - 1; i >= 0; i--) {
                char currentChar = num.charAt(i);
                if (Character.isDigit(currentChar) && (currentChar - '0') % 2 != 0) {
                    // If the current character is a digit and an odd number, return the substring
                    // from the beginning of the string up to the current character.
                    return num.substring(0, i + 1);
                }
            }
            // If no odd number is found, return an empty string.
            return "";
        }
    }

