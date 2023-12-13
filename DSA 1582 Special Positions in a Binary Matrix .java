package com.Daily_Leetcode_Challenges;
//https://leetcode.com/problems/special-positions-in-a-binary-matrix/description/?envType=daily-question&envId=2023-12-13
public class DSA_1582_Special_Positions_in_a_Binary_Matrix {

    public static int numSpecial(int[][] mat) {
        int R = mat.length;
        int C=mat[0].length;
        int[] row=new int[R];
        int[] col=new int[C];
        int count =0;

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(mat[i][j]==1){
                    row[i]++;
                    col[j]++;
                }
            }
        }

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(mat[i][j]==1 && row[i]==1 &&col[j]==1){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[][] mat ={ {1,0,0},
                       {0,1,0},
                       {0,0,1} };
        System.out.println("Special Positions in a Binary Matrix are -> "+numSpecial(mat));
    }
}
