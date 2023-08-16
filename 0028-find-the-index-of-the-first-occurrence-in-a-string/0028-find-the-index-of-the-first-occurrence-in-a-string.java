class Solution {
    public int strStr(String haystack, String needle) {
        
        
        int l2=needle.length();
        int l1=haystack.length();
        String s ="";
        int ans=-1;
        
        
        for(int i=0;i<=l1-l2;i++)
        {
           
            s=haystack.substring(i,i+l2);
            if(s.equals(needle))
            {
                ans=i;
                break;
            }
        }
        return ans;
        
        
        
    }
}