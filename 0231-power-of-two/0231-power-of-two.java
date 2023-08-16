class Solution {
    public boolean isPowerOfTwo(int n) {
        
        double k=0.0;
        int c=0;
        while(Math.pow(2,c)<=n)
        {
            k=Math.pow(2,c);
            if(k==n)
            {
                return true;
            }
            c++;
        }
        return false;
    }
}