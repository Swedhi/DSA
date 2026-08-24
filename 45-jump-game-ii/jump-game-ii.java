class Solution {
    public int jump(int[] nums) {
        int jumps=0; //no. of jumps taken
        int currentEnd=0; //end of the current jump range
        int farthest=0;  //farthest index reachable so far
        for(int i=0;i<nums.length-1;i++){
            farthest=Math.max(farthest,i+nums[i]);

            if(i==currentEnd){
                jumps++;
                currentEnd=farthest;
            }
        }
        return jumps;
        
    }
}