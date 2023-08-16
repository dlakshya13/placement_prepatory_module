class Solution {
    public int lengthOfLastWord(String s) {
        
        
        String n=s.trim();
        int l=n.length();
        int i=l-1;
        int c=0;
        
        while(i>=0)
        {
            
            if(n.charAt(i)!=' ')
            {
             c++;
            }
            else
            {
                break;
            }
            i--;
        }
        
        return c;
        
    }
}