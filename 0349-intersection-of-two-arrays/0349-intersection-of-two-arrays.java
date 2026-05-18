class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=0;
        int temp[]=new int[Math.min(n,m)];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(nums1[i]==nums2[j])
                {
                    boolean duplicate=false;
                    for(int l=0; l<k; l++)
                    {
                        if(temp[l]==nums1[i])
                        {
                            duplicate=true;
                            break;
                        }
                    }
                    if(!duplicate)
                    {
                        temp[k++]=nums1[i];
                    }
                    break;
                }
            }
        }
        return Arrays.copyOfRange(temp,0,k);
    }
}