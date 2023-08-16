class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int a=mat.length;
        int b=mat[0].length;
        if(r*c != a*b)
        {
            return mat;
        }
        
        int[] aa=new int[r*c];
        int k=0;
        
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                aa[k]=mat[i][j];
                k++;
            }
        }
        
        int[][] mat1=new int[r][c];
        int cc=0;
        
        for(int ii=0;ii<r;ii++)
        {
            for(int jj=0;jj<c;jj++)
            {
                mat1[ii][jj]=aa[cc];
                cc++;
            }
        }
        
        return mat1;
        
        
        
    }
}