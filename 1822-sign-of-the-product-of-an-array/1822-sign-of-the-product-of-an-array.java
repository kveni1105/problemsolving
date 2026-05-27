class Solution {
    public int arraySign(int[] nums) {
        int n=nums.length;
        int prod=1;
        for(int i=0; i<n; i++)
        {
           if(nums[i]==0)
           {
            return 0;
           }
           if(nums[i]<0)
           {
            prod *=-1;
           }

        }
        return prod;
    }
}