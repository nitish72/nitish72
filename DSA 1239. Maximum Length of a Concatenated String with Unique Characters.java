// Date: 23th Jan 2024
//https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/submissions/1154440861/?envType=daily-question&envId=2024-01-23

class Solution {
    public int maxLength(List<String> arr) {
       return backtrack(arr, 0, "");
    }

    private int backtrack(List<String> arr, int index, String current) {
        if (index == arr.size() && isUnique(current)) {
            return current.length();
        }

        int maxLength = 0;

        // Exclude the current string
        maxLength = Math.max(maxLength, backtrack(arr, index + 1, current));

        // Include the current string if it doesn't have duplicate characters
        if (isUnique(current + arr.get(index))) {
            maxLength = Math.max(maxLength, backtrack(arr, index + 1, current + arr.get(index)));
        }

        return maxLength;
    }

    private boolean isUnique(String str) {
        int[] charCount = new int[26]; // Assuming only lowercase English letters

        for (char ch : str.toCharArray()) {
            if (charCount[ch - 'a'] > 0) {
                return false; // Duplicate character found
            }
            charCount[ch - 'a']++;
        }

        return true;  
    }
}
