class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer>list=new ArrayList<>();
        Arrays.sort(nums);
        int j=0;
        for(int i=1; i<=n; i++)
        {
            while(j<n && nums[j]<i)
            {
                j++;
            }
            if(j>=n || nums[j]!=i)
            {
                list.add(i);
            }
        }
        return list;
    }
}