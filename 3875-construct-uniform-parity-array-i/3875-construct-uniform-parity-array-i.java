class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int even=0, odd=0;
        for(int i=0; i<n; i++)
        {
            if(nums1[i]%2==0)
            {
                even=1;
            }
            else
            {
                odd=1;
            }
        }
        if(even>=1)
        return true;
        else if(odd>=1)
        return true;
        else
        return true;
    }
}