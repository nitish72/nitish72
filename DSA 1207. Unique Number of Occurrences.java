// Date : 17th Jan 2024
// https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=daily-question&envId=2024-01-17

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] countArray = new int[2000];
        for(int i : arr){
            countArray[i + 1000]++;
        }
        Arrays.sort(countArray);

        for(int i = 0; i<countArray.length-1 ; i++){
            if(countArray[i]!=0 && countArray[i] == countArray[i+1])
            {
                return false;
            }
        }
        return true;
    }
}
