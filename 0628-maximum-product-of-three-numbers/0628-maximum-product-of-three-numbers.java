class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int l=nums.length-1;
        int b=nums[l]*nums[l-1]*nums[l-2];
        int c=nums[0]*nums[1]*nums[l];
        if(c>b)
        {
            return c;
        }
        return b;
    }
}