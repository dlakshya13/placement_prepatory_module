
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       // List<List<Integer>> a=new ArrayList<>();
        Stack<List<Integer>> c=new Stack<>();
        
        c= lev(root);
         List<List<Integer>> b=new ArrayList<>();
        
        while(!c.empty())
        {
            b.add(c.peek());
            c.pop();
        }
        return b;
        
        
    }
    public Stack<List<Integer>> lev(TreeNode root)
    { Stack<List<Integer>> a=new Stack<>();
        if(root==null)
        {
            return a;
        }
       Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> s=new ArrayList<>();
            int t=q.size();
            for(int i=1;i<=t;i++)
            {
                if(q.peek().left!=null)
                {
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null)
                {
                    q.add(q.peek().right);
                }
                s.add(q.remove().val);
              
            }
            a.push(s);
                
            }
         return a;
        }
    }
