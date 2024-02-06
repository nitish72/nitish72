// Date : 06th Feb 2024
// https://leetcode.com/problems/group-anagrams/submissions/1167567480/?envType=daily-question&envId=2024-02-06

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }

            anagramGroups.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramGroups.values());  
    }
}
