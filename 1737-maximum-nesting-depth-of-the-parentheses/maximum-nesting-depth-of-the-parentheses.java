class Solution {
    public int maxDepth(String s) {
        int currDepth=0;
        int maxDepth=0;
        for(int i=0;i<s.length();i++){
            char currChara=s.charAt(i);
            if(currChara=='('){
                currDepth++;
                if(currDepth>maxDepth){
                    maxDepth=currDepth;
                }
            }
            else if(currChara==')'){
                currDepth--;

            }
        }
        return maxDepth;
        
    }
}