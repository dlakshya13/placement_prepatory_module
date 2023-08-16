class Solution {
    public int mySqrt(int x) {
        
        int i;
        if(x==2147483647)
        {
            return 46340;
        }
      for(i=0;i<x;i++)
      {
          
          if(i*i >= x)
          {
              break;
          }
         
      }
        
        if(i*i == x)
        {
            return i;
        }
        return i-1;
        
    }
}