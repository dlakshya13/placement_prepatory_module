class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
        int a[]=new int[nums.length];
        
        
        for(int i=0;i<nums.length;i++)
        {
            a[i]=nums[i];
            
        }
        
        Arrays.sort(a);
        
        
        int st=0;
        int en=0;
        
        int t=0;
        
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=nums[i])
            {
                st=i;
                break;
            }
            
        }
        
       for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]!=nums[i])
            {
                en=i;
                break;
            }
            
        }
        
        if(st==0 && en==0)
        {
            return 0;
        }
            
            return en-st+1;
        
        
        
        
        
        
        
    }
}