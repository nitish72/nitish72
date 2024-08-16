//Date : 16th Aug 2024

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        // Initialize global minimum and maximum using the first array
        int global_min = arrays.get(0).get(0);
        int global_max = arrays.get(0).get(arrays.get(0).size() - 1);
        int max_distance = 0;

        // Iterate over the rest of the arrays
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> array = arrays.get(i);
            int current_min = array.get(0);  // Correctly refer to the first element of the current array
            int current_max = array.get(array.size() - 1);  // Correctly refer to the last element of the current array

            // Calculate potential maximum distance
            max_distance = Math.max(max_distance, Math.abs(current_max - global_min));
            max_distance = Math.max(max_distance, Math.abs(global_max - current_min));

            // Update global min and max
            global_min = Math.min(global_min, current_min);
            global_max = Math.max(global_max, current_max);
        }
        return max_distance;
    }
}
