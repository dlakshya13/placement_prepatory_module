class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int l=matrix.length * matrix[0].length;
        
        int[] arr=new int[l];
        
        int kk=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                arr[kk]=matrix[i][j];
                kk++;
            }
            
        }
        
        
        Arrays.sort(arr);
        return arr[k-1];
        
    }
}