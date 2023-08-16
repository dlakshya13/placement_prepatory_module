class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> li=new ArrayList<>();
        
        int n=nums.length;
        int m=n/3;
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        
        int b=0;
        for(int i=0;i<n;i++)
        {
            
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }
            else
            {
              b=hm.get(nums[i]);
                b=b+1;
                hm.put(nums[i],b);
            }
            
        }
        
        for(int i:hm.keySet())
        {
            if(hm.get(i)>m)
            {
                li.add(i);
            }
            
            
        }
        
        return li;
        
        
        
    }
}