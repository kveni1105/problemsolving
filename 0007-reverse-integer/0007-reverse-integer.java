class Solution {
    public int reverse(int x) {
        boolean neg=x<0;
        String s=Integer.toString(Math.abs(x));
        char ch[]=s.toCharArray();
        int n=ch.length;
        int result=0;
        for(int i=n-1; i>=0; i--)
        {
            int val=ch[i]-'0';
            if (result > (Integer.MAX_VALUE - val) / 10) {
                return 0;
            }
            result=result*10+val;
        }
        return neg?-result:result;
    }
}