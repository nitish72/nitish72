package com.Daily_Leetcode_Challenges;
//https://leetcode.com/problems/calculate-money-in-leetcode-bank/description/?envType=daily-question&envId=2023-12-06
public class DSA_1716_Calculate_Money_in_Leetcode_Bank {

    class Solution {
        public int totalMoney(int n) {

            int totalMoney = 0;
            int week = 0;

            for (int i = 0; i < n; i++) {
                if (i % 7 == 0) {
                    // Start of a new week
                    week++;
                }

                totalMoney += (i % 7) + week;
            }

            return totalMoney;


        }
    }

    public static void main(String[] args) {

    }
}
