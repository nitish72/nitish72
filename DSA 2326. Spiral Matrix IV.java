// 
//https://leetcode.com/problems/spiral-matrix-iv/submissions/1384013838/?envType=daily-question&envId=2024-09-09

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {

        //
        int[][] matrix = new int[m][n];
        for (int[] row : matrix) {
            Arrays.fill(row, -1);
        }

        int[] directions = {0, 1, 0, -1, 0}; // right, down, left, up
        int x = 0, y = 0, d = 0;

        while (head != null) {
            matrix[x][y] = head.val;
            head = head.next;

            int nextX = x + directions[d];
            int nextY = y + directions[d + 1];

            if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n || matrix[nextX][nextY] != -1) {
                d = (d + 1) % 4; // change direction
                nextX = x + directions[d];
                nextY = y + directions[d + 1];
            }

            x = nextX;
            y = nextY;
        }

        return matrix;
        
    }
}
