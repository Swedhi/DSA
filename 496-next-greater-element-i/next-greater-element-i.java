import java.util.*;

class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Map will store:
        // number -> its next greater element
        HashMap<Integer, Integer> map = new HashMap<>();

        Stack<Integer> st = new Stack<>();

        // Traverse nums2 from right to left
        for (int i = nums2.length - 1; i >= 0; i--) {

            // Remove all elements smaller than or equal to nums2[i]
            // because they cannot be the next greater element.
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            // If stack is empty, no greater element exists.
            if (st.isEmpty()) {
                map.put(nums2[i], -1);
            } else {

                // Top of stack is the next greater element.
                map.put(nums2[i], st.peek());
            }

            // Push current element for future elements.
            st.push(nums2[i]);
        }

        // Create answer for nums1
        int[] nge = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            nge[i] = map.get(nums1[i]);
        }

        return nge;
    }
}