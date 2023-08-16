class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        
        List<Integer> a=new ArrayList<>();
        int i, k = 0, l = 0;
 
       
        int m=matrix.length;
        int n=matrix[0].length;
        while (k < m && l < n) {
           
            for (i = l; i < n; ++i) {
                a.add(matrix[k][i]);
            }
            k++;
 
            
            for (i = k; i < m; ++i) {
               a.add(matrix[i][n - 1]);
            }
            n--;
 
            
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    a.add(matrix[m - 1][i]);
                }
                m--;
            }
 
            
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    a.add(matrix[i][l]);
                }
                l++;
            }
        
        }
            
        return a;
        
        
    }
}