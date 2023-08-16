class Solution {
    public int lengthOfLongestSubstring(String s) {
     
        HashMap<Character,Integer> hm=new HashMap<>();
        
        int i=0;
        int ans=0;
        
        for(int j=0;j<s.length();j++)
        {  
            
            if(hm.containsKey(s.charAt(j)))
            {
                i=Math.max(i,hm.get(s.charAt(j))+1);
               
            }
            
           
              
                hm.put(s.charAt(j),j);
                ans=Math.max(ans,j-i+1);
                
            
                
                
            
                
            
        }
        
        return ans;
        
    }
}