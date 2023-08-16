class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
    int l=s.length();
        if(l<2)
        {
            return false;
        }
        String t="";
        for(int i=0;i<l/2;i++)
        {
            t=t+s.charAt(i);
            if(s.substring(i+1).length()%t.length()==0)
            {
                boolean ans=fun(s.substring(i+1),t);
                    if(ans==true)
                    {
                        return true;
                    }
                
            }
            
            
        }
        return false;
        
        
        
    }
    
    public boolean fun(String st,String str)
    {
        
        for(int i=0;i<st.length();i=i+str.length())
        {
           String k= st.substring(i,i+str.length());
            if(!k.equals(str))
            {
                return false;
            }
        }
        
        
        
        return true;
    }
    
}