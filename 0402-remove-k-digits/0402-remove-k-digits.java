class Solution {
    public String removeKdigits(String num, int k) {
        
        
        Stack<Character> s=new Stack<>();
        
        
        int i=0;
        int j=0;
        
        while(i<num.length())
        {
            int c=(int)num.charAt(i);
            while(!s.empty() && s.peek()>c && k>0)
            {
                s.pop();
                k--;
            }
            
            
            s.push(num.charAt(i));
           
            i++;
        }
        
        
        String ans="";
      while(!s.empty())
      {
          ans=ans+s.peek();
          s.pop();
      }
        
        String an="";
        int kk=0;
        for(i=ans.length()-1;i>=0;i--)
        {
            if(ans.charAt(i)!='0')
            {
                kk=1;
                
            }
            if(kk==1)
            {
                
            an=an+ans.charAt(i);
            }
        }
        
        
        while(k>0 && an.length()>0)
        {
            an=an.substring(0,an.length()-1);
            k--;
        }
        
        if(an.length()==0)
        {
            return "0";
        }
        
      return an;  
    }
}