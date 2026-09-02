class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>prev=new ArrayList<>();
        prev.add(1);
        ans.add(prev);
        for(int i=1; i<n; i++)
        {
            List<Integer>curr=new ArrayList<>(i+1);
            
                for(int k=0; k<i+1; k++)
                {
                    curr.add(1);
                }
                for(int j=1; j<i; j++)
                {
                    curr.set(j,prev.get(j-1)+prev.get(j));
                }
            
            ans.add(curr);
            prev=curr;
        }
        return ans;
    }
}