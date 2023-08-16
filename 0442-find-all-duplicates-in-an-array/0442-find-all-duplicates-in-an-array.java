class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        int of;
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }
            else
            {
                of=hm.get(nums[i]);
                of=of+1;
                hm.put(nums[i],of);
            }
        }
        
        
        for(int j:hm.keySet())
        {
            if(hm.get(j)>1)
            {
                a.add(j);
            }
        }
        return a;
        
    }
}