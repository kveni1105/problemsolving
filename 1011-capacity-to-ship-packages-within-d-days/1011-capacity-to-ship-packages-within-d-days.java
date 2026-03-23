class Solution {
    public boolean calculate(int weights[],int days,int mid)
    {
        int day=1;
        int load=0;
        for(int x:weights)
        {
            if(load+x>mid)
            {
                day++;
                load=x;
            }
            else
            load+=x;
        }
        if(day<=days)
        return true;
        else
        return false;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=0;
        int left=0;
        int right=0;
        int ans=0;
        int n=weights.length;
        for(int i=0; i<n; i++)
        {
            high+=weights[i];
        }
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(calculate(weights,days,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return ans;
    }
}