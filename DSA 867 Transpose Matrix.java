package com.Daily_Leetcode_Challenges;

public class DSA_867_Transpose_Matrix {
        public static int[][] transpose(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;

            int[][] transposeMatrix = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transposeMatrix[j][i] = matrix[i][j];
                }
            }

            return transposeMatrix;
        }

    public static void main(String[] args) {
            int[][] matrix = { { 1, 2 }, { 3, 4 } };
            int res[][] = transpose(matrix);
        System.out.println(res);


    }
}
