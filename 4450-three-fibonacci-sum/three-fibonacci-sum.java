class Solution {
    public boolean threeFibonacciSum(int n) {
        long a=0;
        long b=1;
        long c=1;
        while(true){
            long sum=a+b+c;
            if(sum==n){
                return true;

            }
            if(sum>n){
                return false;
            }
            a=b;
            b=c;
            c=a+b;
        }
        
    }
}