class Solution {
    public List<String> fizzBuzz(int n) {
        String k="";
        List<String> ans=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                k="FizzBuzz";
            }
            else if(i%3==0)
            {
                k="Fizz";
            }
            else if(i%5==0)
            {
                k="Buzz";
            }
            else
            {
                k=String.valueOf(i);
            }
            ans.add(k);
        }
        return ans;
    }
}