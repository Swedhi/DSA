import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombination(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void findCombination(int index, int[] arr, int target,
                                 List<Integer> current,
                                 List<List<Integer>> result) {

        // Base case
        if (target == 0) {
            result.add(new ArrayList<>(current)); // store answer
            return;
        }

        // Loop through candidates
        for (int i = index; i < arr.length; i++) {

            // Skip if element is greater than remaining target
            if (arr[i] > target) continue;

            current.add(arr[i]); // choose

            // same index because repetition allowed
            findCombination(i, arr, target - arr[i], current, result);

            current.remove(current.size() - 1); // backtrack
        }
    }
}