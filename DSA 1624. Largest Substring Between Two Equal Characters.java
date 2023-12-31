// Date: 31th Dec 2023
// https://leetcode.com/problems/largest-substring-between-two-equal-characters/description/?envType=daily-question&envId=2023-12-31
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstOccurrence = new int[26]; // Assuming lowercase English letters
        int maxSubstringLength = -1;

        // Initialize the first occurrence array with -1
        Arrays.fill(firstOccurrence, -1);

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int charIndex = currentChar - 'a';

            if (firstOccurrence[charIndex] == -1) {
                // First occurrence of the character
                firstOccurrence[charIndex] = i;
            } else {
                // Calculate the substring length between two equal characters
                int substringLength = i - firstOccurrence[charIndex] - 1;
                maxSubstringLength = Math.max(maxSubstringLength, substringLength);
            }
        }
        return maxSubstringLength;  
    }
}
