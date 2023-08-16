class Solution {
    public int[] searchRange(int[] nums, int t) {
        int a[]=new int[2];
        int ll=nums.length-1;
        
        if(ll==0)
        {
            a[0]=-1;
            a[1]=-1;
        }
        int l=0;
        int h=ll;
        int mid=0;
        int fl=0;
        
        for(int i=0;i<=ll;i++)
        {
            if(nums[i]==t)
            {
                a[0]=i;
                fl=1;
                break;
            }
        }
        if(fl==0)
        {
            a[0]=-1;
            a[1]=-1;
        }
        
        for(int j=ll;j>=0;j--)
            {
            
            if(nums[j]==t)
            {
                a[1]=j;
                break;
            }
        }
        return a;
        
    }
}