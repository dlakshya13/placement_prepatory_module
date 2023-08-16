class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
 
        
        int sum = 0;
        map.put(0,0);
        for(int i=0; i<nums.length; i++){
            
            sum += nums[i];
            
            if(!map.containsKey(sum % k)){
                map.put(sum % k, i+1);
            }else{
                
                if(i>map.get(sum%k))
                {
                   return true;  
                }
                
                   
                
            }
            
        }
        
        return false;
        
    }
}