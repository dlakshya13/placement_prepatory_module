class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int i=matrix.length;
        int j=matrix[0].length;
        int r=0;
        int c=j-1;
        
        while(r<i && c>=0)
        {
           int tem=matrix[r][c];
            if(tem==target)
            {
                return true;
            }
            else if(tem<target)
            {
                r++;
            }
            else
            {
                c--;
            }
            
        }
        return false;
        
    }
}