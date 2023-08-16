class Solution {
    public boolean isPowerOfFour(int n) {
        
        
        if(n==0)
        {
            return false;
        }
        int i=0;
        while(Math.pow(4,i)<=n)
        {
            i++;
        }
        if(Math.pow(4,i-1)==n)
        {
            return true;
        }
        return false;
        
    }
}