class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        ArrayList<ArrayList<Integer>> adjls=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            adjls.add(new ArrayList<>());
            
            
        }
        int[] V=new int[n];
        
        
        
        
        
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    adjls.get(i).add(j);
                    adjls.get(j).add(i);
                }
            }
        }
      
        int c=0;
        
        
        for(int i=0;i<n;i++)
        {
               
            if(V[i]==0)
            {
                c++;
                dfs(i,adjls,V);
            }
            
            
        }
        
        return c;
        
        
        
        
        
        
    }
    public void dfs(int no,ArrayList<ArrayList<Integer>> adjls,int V[])
    {
        V[no]=1;
        
        
        
        for(int i:adjls.get(no))
        {
            
              if(V[i]==0)
              {
                  dfs(i,adjls,V);
              }
            
        }
        
        
    }
    
    
    
}