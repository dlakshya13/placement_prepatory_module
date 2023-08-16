class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int k=0;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                c++;
                k=Math.max(k,c);
            }
            else 
            {
                
                c=0;
                
            }
          
        }
       
          return k;
    }
}