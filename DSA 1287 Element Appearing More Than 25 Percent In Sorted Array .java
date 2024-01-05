package com.Daily_Leetcode_Challenges;

public class DSA_1287_Element_Appearing_More_Than_25_Percent_In_Sorted_Array {

        public static int findSpecialInteger(int[] arr) {

            int n = arr.length;
            int quarter = n / 4;

            for (int i = 0; i < n - quarter; i++) {
                if (arr[i] == arr[i + quarter]) {
                    return arr[i];
                }
            }

            return -1;

        }


    public static void main(String[] args) {
        int [] arr = {1,2,2,6,6,6,6,7,10};
        System.out.println(findSpecialInteger(arr));
    }
}
