class Solution {
    public int thirdMax(int[] nums) {
       
        ArrayList<Integer> a=new ArrayList<>();
        
        
        for(int i:nums)
        {
            if(!a.contains(i))
            {
                a.add(i);
            }
        }
        
        Collections.sort(a);
        if(a.size()<3)
        {
            return a.get(a.size()-1);
        }
        return a.get(a.size()-3);
        
        
    }
}