class Solution {
    public int singleNumber(int[] nums) {
        
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
        
        for(int y:hm.keySet())
        {
            if(hm.get(y)<3)
            {
                return y;
            }
        }
        
        
        
        return -1;
        
        
    }
}