class Solution {
    public void rotate(int[][] matrix) {
        int l=matrix.length;
        int temp=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                
            }
        }
        int tempp=0;
        for(int i=0;i<l/2;i++)
        {
            for(int j=0;j<l;j++)
            {
                tempp=matrix[j][i];
                matrix[j][i]=matrix[j][l-1-i];
                matrix[j][l-1-i]=tempp;
            }
        }
       for(int i=0;i<l;i++)
       {
           for(int j=0;j<l;j++)
           {
               System.out.println(matrix[j][i]);
           }
       }
    }
}