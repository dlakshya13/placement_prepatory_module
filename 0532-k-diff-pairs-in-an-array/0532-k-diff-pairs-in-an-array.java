class Solution {
    public int findPairs(int[] nums, int k) {
        
       
        
        long c=0;
        
        
        Arrays.sort(nums);
        
        int a1=0;
        int a2=1;
        int l=nums.length;
        
       
        while(a1<l && a2<l)
        {
           if((nums[a2]-nums[a1])<k)
           {
               a2++;
           }
            else if((nums[a2]-nums[a1])>k)
            {
                a1++;
                if((a2-a1)==0)
                {
                    a2++;
                }
            }
            
            else{
                c++;
                a1++;
                a2++;
                while(a2<l && nums[a2]==nums[a2-1])
                {
                    a2++;
                }
            }
            
        }
        
        
        return (int)c;
        
    }
}