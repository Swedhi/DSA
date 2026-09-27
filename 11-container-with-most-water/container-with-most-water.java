class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxW=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int width=j-i;
            int currH=Math.min(height[i],height[j]);
            int currA=width*currH;
            maxW=Math.max(maxW,currA);
            if(height[i]<height[j]){
                i++;

            }
            else{
                j--;
            }

        }
        return maxW;
        
        
    }
}