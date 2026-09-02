import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        // Store all subsets.
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        // Total number of subsets = 2^n.
        // 1 << n means 2^n.
        int totalSubsets = 1 << n;

        // Generate every binary mask from 0 to 2^n - 1.
        for (int mask = 0; mask < totalSubsets; mask++) {

            // Store the current subset.
            List<Integer> currentSubset = new ArrayList<>();

            // Check every bit position.
            for (int i = 0; i < n; i++) {

                // Check if the i-th bit of mask is 1.
                if ((mask & (1 << i)) != 0) {

                    // If bit is 1, include nums[i].
                    currentSubset.add(nums[i]);
                }
            }

            // Add the generated subset to the answer.
            result.add(currentSubset);
        }

        return result;
    }
}