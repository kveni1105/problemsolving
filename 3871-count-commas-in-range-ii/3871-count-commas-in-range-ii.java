class Solution {
    public long countCommas(long n) {
        long l=1000;
        long ans=0;
        while(l<=n)
        {
            ans+=n-l+1;
            l*=1000;
        }
        return ans;
    }
}