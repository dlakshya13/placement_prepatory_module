class Solution {
    public int findMaxLength(int[] nums) {
        
        int l=nums.length;
        
     
           HashMap<Integer,Integer> hm=new HashMap<>();
       int s=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==0)
            {
            s=s-1;
            }
            else
            {
                s=s+1;
            }
            if(!hm.containsKey(s))
            {
                hm.put(s,i);
            }
            
        }
        
        
        int s1=0;
        int ans=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==0)
            {
                s1=s1-1;
                
            }
            else 
            {
                s1=s1+1;
            }
            
            if(s1==0)
            {
                ans=i+1;
            }
            else if(hm.containsKey(s1))
            {
                if((i-hm.get(s1))>ans)
                {
                    ans=i-hm.get(s1);
                }
            }
          
                
            
            
            
        }
        
        
        return ans;
        
        
        
    }
}