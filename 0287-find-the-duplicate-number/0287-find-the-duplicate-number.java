class Solution {
    public int findDuplicate(int[] nums) {
     
        
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
            if(hm.get(y)>=2)
            {
                return y;
            }
        }
        
        return -1;
        
    }
}