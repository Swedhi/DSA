class Solution {
    public int minRotations(String s) {
        int curr=0;
        int total=0;
        for(int i=0;i<s.length();i++){
            int target=s.charAt(i)-'0';
            int diff=Math.abs(target-curr);
            int rotation=Math.min(diff,10-diff);
            total=total+rotation;
            curr=target;
        }
        return total;
        
    }
}