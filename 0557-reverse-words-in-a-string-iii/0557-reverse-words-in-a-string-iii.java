class Solution {
    public String reverseWords(String s) {
        
        String[] k=s.split(" ");
        String m="";
        for(int i=0;i<k.length-1;i++)
        {
            m=m+fun(k[i])+" ";
            
        }
        m=m+fun(k[k.length-1]);
        return m;
        
        
    }
    
    public String fun(String s)
    {
        
        String a="";
        
        for(int i=s.length()-1;i>=0;i--)
        {
              a=a+s.charAt(i);
        }
        
        return a;
        
    }
    
    
    
    
}