class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int m=nums.length;
        int n=1<<m;
        List<List<Integer>>result=new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            List<Integer>subset=new ArrayList<>();
            for(int j=0; j<m; j++)
            {
                if((i&(1<<j))!=0)
                {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
}