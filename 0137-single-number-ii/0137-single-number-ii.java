class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            if(map.containsKey(num))
            {
                map.put(num, map.get(num)+1);
            }
            else
            {
                map.put(num,1);
            }
        }
        for(int k:map.keySet())
        {
            if(map.get(k)==1)
            {
                return k;
            }
        }
        return n-1;
    }
}