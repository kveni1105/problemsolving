class Solution {
    public boolean isPalindrome(String s) {
        String clean=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char ch[]=clean.toCharArray();
        int n=ch.length;
        char temp[]=new char[n];
        for(int i=0; i<n; i++)
        {
            temp[i]=ch[n-1-i];
        }

        String original=new String(ch);
        String reverse=new String(temp);

        return original.equals(reverse);
    }
}