class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int temp[]=new int[n+m];
        for(int i=0; i<n;i++)
        {
            temp[i]=nums1[i];
        }
        for(int i=0; i<m;i++)
        {
            temp[n+i]=nums2[i];
        }
        int size=temp.length;
        Arrays.sort(temp);
        if(size%2==0)
        {
            return (temp[size/2]+temp[size/2-1])/2.0;
        }
        else
        {
            return temp[size/2];
        }
    }
}