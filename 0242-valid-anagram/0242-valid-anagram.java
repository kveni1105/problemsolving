class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m)
        return false;
        char ch[]=s.toCharArray();
        char arr[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(arr);
        for(int i=0; i<n; i++)
        {
            if(ch[i]!=arr[i])
            return false;
        }
        return true;
    }
}