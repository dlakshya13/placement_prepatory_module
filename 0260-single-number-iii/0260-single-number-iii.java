class Solution {
    public int[] singleNumber(int[] nums) {
        
        
         int[] ans=new int[2];
         HashMap<Integer,Integer> hm=new HashMap<>();
       
        for(int x:nums)
        {
            if(!hm.containsKey(x))
            {
                hm.put(x,1);
            }
            else
            {
                hm.put(x,hm.get(x)+1);
            }
        }
        
        int k=0;
        
        for(int y:hm.keySet())
        {
            if(hm.get(y)==1)
            {
                ans[k]=y;
                k++;
            }
        }
        
        return ans;
        
    }
}