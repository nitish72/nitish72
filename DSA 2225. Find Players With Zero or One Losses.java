// Date : 15th Jan 2024
// https://leetcode.com/problems/find-players-with-zero-or-one-losses/?envType=daily-question&envId=2024-01-15

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<Integer> zeroLosses = new ArrayList<>();
        List<Integer> oneLosses = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap();

        for(int[] team : matches){
            map.put(team[0], map.getOrDefault(team[0], 0) + 0);
            map.put(team[1], map.getOrDefault(team[1], 0) + 1);
        }
        for(int i : map.keySet()){
            if(map.get(i) == 0){
                zeroLosses.add(i);
            }else if(map.get(i)== 1){
                oneLosses.add(i);
            }
        }
        Collections.sort(zeroLosses);
        Collections.sort(oneLosses);

        return Arrays.asList(zeroLosses, oneLosses);
    }
}
