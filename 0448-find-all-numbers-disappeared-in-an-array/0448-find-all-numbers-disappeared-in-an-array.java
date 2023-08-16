class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int l=nums.length;
        ArrayList<Integer> a=new ArrayList<>();
         Set<Integer> b=new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {
            
            b.add(nums[i]);
        }
        
        
        
        
        
         for(int j=1;j<=nums.length;j++)
        {
             
             if(!b.contains(j))
             {
                a.add(j);
             }
         }
        
        return a;
        
        
    }
}