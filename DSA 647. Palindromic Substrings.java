// Date : 10th Feb 2024
// https://leetcode.com/problems/palindromic-substrings/description/?envType=daily-question&envId=2024-02-10

class Solution {
    public int countSubstrings(String s) {
      int totalCount = 0;
    for(int i = 0; i < s.length(); i++){
     totalCount +=countPallindrome(s,i,i);
     totalCount +=countPallindrome(s, i, i+1);
      }  
      return totalCount;
    }
    private int countPallindrome(String str, int start, int end){
        int count = 0;
        while(start >= 0 && end < str.length() && str.charAt(start)==str.charAt(end)){
            count++;
            start--;
            end++;
        }
        return count;
    }
}

