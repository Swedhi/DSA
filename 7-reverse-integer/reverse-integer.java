class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int digit=x%10;
            if(rev>Integer.MAX_VALUE/10){  //reverse * 10 will exceed Integer.MAX_VALUE
             
                return 0;
            }
            if(rev<Integer.MIN_VALUE/10){  // Check negative overflow
                return 0;
            }
            if(rev==Integer.MAX_VALUE/10 && digit>7){  //Integer.MAX_VALUE = 2147483647
                return 0;
            }
            if(rev==Integer.MIN_VALUE/10 && digit<-8){   //Integer.MIN_VALUE = -2147483648

            }
            rev=rev*10+digit;
            x=x/10;
        }
        return rev;
        
    }
}