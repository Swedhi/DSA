class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,z=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                 z++;
            }
            while(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            maxLength=Math.max(maxLength,i-l+1);
        }
        return maxLength;
        
    }
}