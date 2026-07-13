class Solution {
    static ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
    static int vis[];
    public static void dfs(int node)
    {
        vis[node]=1;
        for(int i=0; i<adj.get(node).size();i++)
        {
            if(vis[adj.get(node).get(i)]==0)
            {
                dfs(adj.get(node).get(i));
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        adj=new ArrayList<>();
        for(int i=0; i<rooms.size(); i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<rooms.size();i++)
        {
            for(int j=0; j<rooms.get(i).size(); j++)
            {
                adj.get(i).add(rooms.get(i).get(j));
            }
        }
        vis=new int[rooms.size()];
        Arrays.fill(vis,0);
        dfs(0);
        for(int i=0; i<vis.length; i++)
        {
            if(vis[i]==0)
            {
                return false;
            }
        }
        return true;
    }
}