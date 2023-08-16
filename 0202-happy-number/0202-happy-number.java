class Solution {
    public boolean isHappy(int n) {
        
        int flag=0;
        
        int j=n;
        while(j/10!=0)
        {
             
            int s=0;
           
            
            while(j>0)
            {
              
                s=s+(j%10)*(j%10);
                j=j/10;
                
                
            }
            if(s==1)
            {
                flag=1;
                return true;
            }
            
            j=s;
            
            
            
        }
        
        if(j==7)
        {
            return true;
        }
        
        
        if(j==1)
        {
            return true;
        }
        
        
        
        return false;
        
        
        
        
    
        
        
        
    }
    
    
}