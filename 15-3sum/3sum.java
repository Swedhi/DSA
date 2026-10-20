import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // skip duplicate values of i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    int leftVal = nums[j];
                    while (j < k && nums[j] == leftVal) {
                        j++;
                    }

                    int rightVal = nums[k];
                    while (j < k && nums[k] == rightVal) {
                        k--;
                    }

                } 
                else if (sum < 0) {
                    j++;
                } 
                else {
                    k--;
                }
            }
        }

        return result;
    }
}