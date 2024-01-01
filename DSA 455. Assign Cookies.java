// Date 01 Jan 2024
//https://leetcode.com/problems/assign-cookies/?envType=daily-question&envId=2024-01-01
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(g.length == 1 && s.length == 1){
            if(s[0]>=g[0]){
                return 1;
            }
        }
       Arrays.sort(g);
       Arrays.sort(s);
       int count = 0;
       int i=0;
       int j=0;
       while(i<g.length && j<s.length){
          if(s[j]>=g[i]){
           count++;
           i++;
          }
          j++;
       }
      return count;
    }
}
