class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int n = matrix.length-1;
          int  m = matrix[0].length-1;
           int i=0;
        int j=m;
        int a=0;
        while(i<=n&&j>=0)
        {
            a=matrix[i][j];
            if(a==target)
            {
                return true;
            }
            else if(a<target)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return false;
    }
}