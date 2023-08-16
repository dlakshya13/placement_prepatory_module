class Solution {
    public String longestCommonPrefix(String[] strs) {
        
       
        int minl=Integer.MAX_VALUE;
        int index=0;
        
        for(int i=0;i<strs.length;i++)
        {
            
            if(strs[i].length()<minl)
            {
                minl=strs[i].length();
                index=i;
                
            }
            
        }
        char ch;
        int flag=0;
        String ans="";
        if(minl==0)
        {
            return ans;
        }
        
        
        for(int j=0;j<minl;j++)
        {
           
            ch=strs[index].charAt(j);
            for(int k=0;k<strs.length;k++)
            {
                if(k!=index)
                {
                    if(strs[k].charAt(j)!=ch)
                    {
                        flag=1;
                        break;
                    }
                }
                
                
                
            }
            
            if(flag==1)
            {
                break;
            }
            else
            {
                ans=ans+strs[index].charAt(j);
            }
            }
        
        
        return ans;
        
        
    }
}