class Solution {
    public int romanToInt(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            int currVal=getValue(s.charAt(i));
            if(i+1<s.length()){
                int nextVal=getValue(s.charAt(i+1));
                if(currVal<nextVal){
                    total-=currVal;
                }
                else{
                    total+=currVal;
                }
            }
            else{
                total+=currVal;
            }
        }
        return total;
        
    }
    private int getValue(char symbol){
        if(symbol=='I'){
            return 1;
        }
        else if(symbol=='V'){
            return 5;
        }
        else if(symbol=='X'){
            return 10;
        }
        else if(symbol=='L'){
            return 50;
        }
        else if(symbol=='C'){
            return 100;

        }
        else if(symbol=='D'){
            return 500;
        }
        else{
            return 1000;
        }
    }
}