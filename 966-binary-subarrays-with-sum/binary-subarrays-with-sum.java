import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has occurred once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element to prefix sum
            prefixSum += nums[right];

            // We need an earlier prefix sum of:
            // prefixSum - goal
            int required = prefixSum - goal;

            // If it exists, those are valid subarrays
            if (map.containsKey(required)) {
                count += map.get(required);
            }

            // Store current prefix sum
            map.put(prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}