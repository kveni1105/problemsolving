class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        if(n<26)
        {
            return false;
        }
        HashSet<Character>set=new HashSet<>();
        sentence=sentence.toLowerCase();
        for(int i=0; i<n; i++)
        {
            if(sentence.charAt(i)>='a'||sentence.charAt(i)<='z')
            {
                set.add(sentence.charAt(i));
            }
        }
        if(set.size()==26)
        {
            return true;
        }
        return false;
    }
}