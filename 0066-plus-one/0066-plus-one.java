class Solution {
    public int[] plusOne(int[] digits) {
        
            int i;
        for (i = digits.length - 1; i >= 0 && digits[i] == 9; i--) {    
            digits[i] = 0;
                 }
    
        if (i == -1) {  
            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;  
        
    return newDigits;
            }
           digits[i]++;   
        
    return digits;
        }
    }