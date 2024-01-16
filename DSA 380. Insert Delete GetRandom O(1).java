// Date: 16th Jan 2024
// https://leetcode.com/problems/insert-delete-getrandom-o1/submissions/1147676092/?envType=daily-question&envId=2024-01-16

class RandomizedSet {

    private Map<Integer, Integer> valueToIndex;
    private List<Integer> values;
    private Random rand;

    public RandomizedSet() {
         valueToIndex = new HashMap<>();
        values = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (valueToIndex.containsKey(val)) {
            return false;
        }
        valueToIndex.put(val, values.size());
        values.add(val);
        return true;  
    }
    
    public boolean remove(int val) {
         if (!valueToIndex.containsKey(val)) {
            return false;
        }
        int index = valueToIndex.get(val);
        int lastValue = values.get(values.size() - 1);
        values.set(index, lastValue);
        valueToIndex.put(lastValue, index);
        values.remove(values.size() - 1);
        valueToIndex.remove(val);
        return true;
    }
    
    public int getRandom() {
      return values.get(rand.nextInt(values.size()));  
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

