class Solution {
    public String reverseWords(String s) {
        String st="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                st=st+s.charAt(i);
             }
            else
            {   if(i!=s.length()-1)
            {   
                if(s.charAt(i+1)!=' ')
                {
                    st=st+s.charAt(i);
                }
            }
            }
        }
                
            
                
        
        String[] arrOfStr = st.split(" "); 
        int l=arrOfStr.length;
        String temp="";
        for(int i=0;i<(l/2);i++)
        {
           temp= arrOfStr[i];
            arrOfStr[i]=arrOfStr[l-1-i];
            arrOfStr[l-1-i]=temp;
        }
        String ans="";
        for(int i=0;i<l;i++)
        {
            ans=ans+arrOfStr[i]+" ";
            
        }
        
        return ans.trim();
    }
}
