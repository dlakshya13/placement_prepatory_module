class Solution {
    public char findTheDifference(String s, String t) {
        
        ArrayList<Character> a=new ArrayList<>();
        
        int a1=0;
        int b1=0;
        
        char ch;
        char ch1;
        char ans=' ';
        int j;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            a1=a1+(int)ch;
            
        }
        
        for(int k=0;k<t.length();k++)
        {
            ch1=t.charAt(k);
            b1=b1+(int)ch1;
            
        }
        int anss=b1-a1;
        
        char chh=(char)anss;
        return chh;
        
        
        
    }
}