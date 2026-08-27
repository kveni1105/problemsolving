class Solution {
    public int reverse(int x) {
        boolean neg=x<0;
        String s=Integer.toString(Math.abs(x));
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1; i>=0; i--)
        {
            sb.append(s.charAt(i));
        }
        try
        {
            int ans=Integer.parseInt(sb.toString());
            return neg?-ans:ans;
        }
        catch(NumberFormatException e)
        {
            return 0;
        }
    }
}