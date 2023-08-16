class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         Set<Integer> s1=new HashSet<>();
        
        ArrayList<Integer> s2=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        
        
        for(int i:nums1)
        {
            s1.add(i);
        }
        
        for(int b:nums1)
        {
            if(!hm.containsKey(b))
            {
                hm.put(b,1);
            }
            else
            {
                int of=hm.get(b);
                of=of+1;
                hm.put(b,of);
            }
        }
        
        
        
        
        
        for(int j:nums2)
        {
            if(hm.containsKey(j))
            {
                if(hm.get(j)>0)
                {
                s2.add(j);
                int of=hm.get(j);
                hm.put(j,of-1);
                }
            }
        }
        
        int ans[]=new int[s2.size()];
        int re=0;
        for(int aa:s2)
        {
            ans[re++]=aa;
        }
        
        
        return ans;
        
    }
}