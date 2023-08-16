class Solution {
    public int removeDuplicates(int[] nums) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        
        for(int x: nums)
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
        int c=0;
        
        for(int y: hm.keySet())
        {
            if(hm.get(y)<=2)
            {
                c=c+hm.get(y);
            }
            else 
            {
                c=c+2;
            }
        }
        
        
        ArrayList<Integer> hs=new ArrayList<>();
        
        
        for(int i=0;i<nums.length;i++)
        {
            if(!hs.contains(nums[i]))
            hs.add(nums[i]);
        }
        
        int t1=0;
        for(int i=0;i<hs.size();i++)
        {
            if(hm.get(hs.get(i))>1)
            {
                nums[t1]=hs.get(i);
                t1++;
                nums[t1]=hs.get(i);
                t1++;
            }
            else
            {
                nums[t1]=hs.get(i);
                t1++;
            }
        }
        
    
        
        
        return c;
        
        
        
    }
}