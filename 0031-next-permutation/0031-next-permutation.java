class Solution {
    public void nextPermutation(int[] nums) {
       
        int in1=0;
        int in2=0;
        int in1el=0;
        int in2el=0;
        
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                in1=i;
                in1el=nums[i];
                break;
            }
        }
        
        for(int j=nums.length-1;j>=0;j--)
        {
            
            if(nums[j]>in1el)
            {
                in2=j;
                in2el=nums[j];
                break;
            }
        }
        
        
         swap(nums,in1,in2);
        int l=nums.length-in1-1;
        
        int num[]=new int[l];
        int t=in1+1;
        
        for(int j=0;j<l;j++)
        {
            num[j]=nums[t];
            t++;
            
        }
        Arrays.sort(num);
        int t1=0;
        for(int j=in1+1;j<nums.length;j++)
        {
            nums[j]=num[t1];
            t1++;
        }
        
        
        
        
        
        
        
        
    }
    
    public void swap(int[] nums,int i,int j)
    {
        int tem=nums[i];
        nums[i]=nums[j];
        nums[j]=tem;
    }
        
}