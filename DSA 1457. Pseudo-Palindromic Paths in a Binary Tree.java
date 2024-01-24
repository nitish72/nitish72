// Date : 24th Jan 2024
// https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/?envType=daily-question&envId=2024-01-24

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   int count = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] freq = new int[10];
        dfs(root, freq);
        return count;
    }
    private void dfs(TreeNode node, int[] freq) {
        if (node == null) {
            return;
        }
        freq[node.val]++;
        if (node.left == null && node.right == null) {
            if (isPseudoPalindromic(freq)) {
                count++;
            }
        }
        dfs(node.left, freq);
        dfs(node.right, freq);
        freq[node.val]--;
    }
    private boolean isPseudoPalindromic(int[] freq) {
        int oddCount = 0;
        for (int i = 1; i <= 9; i++) {
            if (freq[i] % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
        
    }
}
