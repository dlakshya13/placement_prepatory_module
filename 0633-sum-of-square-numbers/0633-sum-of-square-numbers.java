class Solution {
    public boolean judgeSquareSum(int c) {
     
        
        long i=0;
        long j=(long)Math.sqrt(c);
        
        while(i<=j)
        {
            long a=i*i+j*j;
            
            if(a==c)
            {
                return true;
            }
            else if(a<c)
            {
                i++;
            }
            else
            {
                j--;
            }
            
        }
        
        return false;
        
        
    }
}