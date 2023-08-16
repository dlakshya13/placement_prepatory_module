class Solution {
    public boolean canPlaceFlowers(int[] fl, int n) {
        
        
        int l=fl.length;
        
        int c=0;
        
        if(l==1)
        {
            if(fl[0]==0)
            {
                c++;
                if(c>=n)
                {
                return true;
                }
                else 
                {
                    return false;
                }
            }
            
        }
        
        
        
        if(fl[0]==0)
        {
            if(fl[1]==0)
            {
                c++;
                fl[0]=1;
            }
        }
        
        
        if(fl[l-1]==0)
        {
            if(fl[l-2]==0)
            {
                c++;
                fl[l-1]=1;
            }
            
        }
        
        for(int i=1;i<l-1;i++)
        {
            if(fl[i]==0 && fl[i-1]==0 && fl[i+1]==0)
            {
                c++;
                fl[i]=1;
            }
        }
        
        if(c>=n)
        {
            return true;
        }
        
        return false;
    }
}