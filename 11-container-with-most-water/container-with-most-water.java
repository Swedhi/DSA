class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxW=0;
        int i=0,j=n-1;
        while(i<j){
            int width=j-i;
            int currHe= Math.min(height[i],height[j]);
            int a=width*currHe;
            maxW=Math.max(maxW,a);
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