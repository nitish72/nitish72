package com.Daily_Leetcode_Challenges;
//https://leetcode.com/problems/count-of-matches-in-tournament/?envType=daily-question&envId=2023-12-05


public class DSA_1688_Count_of_Matches_in_Tournament {

        public static int numberOfMatches(int n) {
            int matches = 0;
            while (n > 1) {
                // If the number of teams is even
                if (n % 2 == 0) {
                    matches += n / 2;
                    n /= 2;
                } else {
                    // If the number of teams is odd
                    matches += (n - 1) / 2;
                    n = (n - 1) / 2 + 1;
                }
            }
            return matches;
        }

        public static void main(String[] args) {
            // Example usage
            int teams = 7;
            int result = numberOfMatches(teams);
            System.out.println("Total number of matches for " + teams + " teams: " + result);
        }
    }

