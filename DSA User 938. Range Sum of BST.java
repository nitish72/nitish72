// Date 08 Jan 2024
// https://leetcode.com/problems/range-sum-of-bst/submissions/1140080772/?envType=daily-question&envId=2024-01-08
package com.Daily_DSA_Problems;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class DSA_938_Range_Sum_of_BST {
        public int rangeSumBST(TreeNode root, int low, int high) {
            if (root == null) {
                return 0;
            }

            int sum = 0;

            if (root.val >= low && root.val <= high) {
                sum += root.val;
            }

            if (root.val > low) {
                sum += rangeSumBST(root.left, low, high);
            }

            if (root.val < high) {
                sum += rangeSumBST(root.right, low, high);
            }

            return sum;
        }

        public static void main(String[] args) {
            // Example usage:
            // Construct a sample BST:
            //      10
            //     /  \
            //    5   15
            //   / \    \
            //  3   7   18
            TreeNode root = new TreeNode(10);
            root.left = new TreeNode(5);
            root.right = new TreeNode(15);
            root.left.left = new TreeNode(3);
            root.left.right = new TreeNode(7);
            root.right.right = new TreeNode(18);

            int low = 7;
            int high = 15;

            DSA_938_Range_Sum_of_BST  solution = new DSA_938_Range_Sum_of_BST ();
            int result = solution.rangeSumBST(root, low, high);

            System.out.println("The sum of values in the range [" + low + ", " + high + "] is: " + result);

    }
}
