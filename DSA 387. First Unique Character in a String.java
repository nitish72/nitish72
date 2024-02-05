// Date : 05 Feb 2024
// https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=daily-question&envId=2024-02-05

package DSA_Daily_LeetCode;

public class DSA_387_First_Unique_Character_in_a_String {

        public int firstUniqChar(String s) {
            int[] count = new int[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }
            int n =s.length();
            for(int i = 0; i < n; i++){
                char ch=s.charAt(i);
                if (count[ch -'a']==1)
                    return i;

            }
            return -1;
        }

    public static void main(String[] args) {
        DSA_387_First_Unique_Character_in_a_String obj = new DSA_387_First_Unique_Character_in_a_String();
        String s = "loveleetcode";
        System.out.println("Unique Character is : "+obj.firstUniqChar(s));
    }
}

