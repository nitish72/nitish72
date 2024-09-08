// 08th Sep 2024
// https://leetcode.com/problems/split-linked-list-in-parts/submissions/1383532835/?envType=daily-question&envId=2024-09-08
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int length = 0;
        
        // Find the total length of the linked list
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        
        // Determine the size of each part
        int partSize = length / k;  // Minimum size of each part
        int extraNodes = length % k;  // The first extraNodes parts will have one more node
        
        current = head;
        for (int i = 0; i < k && current != null; i++) {
            result[i] = current;
            int currentPartSize = partSize + (i < extraNodes ? 1 : 0);  // Extra node for the first few parts
            
            // Move to the end of the current part
            for (int j = 1; j < currentPartSize; j++) {
                current = current.next;
            }
            
            // Break the current part
            ListNode next = current.next;
            current.next = null;  // Break the list
            current = next;
        }
        
        return result;
    }
}
