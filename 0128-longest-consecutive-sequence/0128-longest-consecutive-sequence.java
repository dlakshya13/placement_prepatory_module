class Solution {
    public int longestConsecutive(int[] nums) {
        
       HashMap<Integer,Boolean> hm=new HashMap<>();
        
        int l=nums.length;
        
        for(int i=0;i<l;i++)
        {
            hm.put(nums[i],true);
        }
            
        for(int t1:hm.keySet())
        {
            if(hm.containsKey(t1-1))
            {
                hm.put(t1,false);
            }
        }
        
        int ans=0;
        for(int t2:hm.keySet())
        {
            if(hm.get(t2)==true)
            {
                int tl=1;
                
                while(hm.containsKey(t2+tl))
                {
                    tl++;
                }
                
                if(tl>ans)
                {
                    ans=tl;
                }
                
            }
        }
        
        
        return ans;
        
    }
}