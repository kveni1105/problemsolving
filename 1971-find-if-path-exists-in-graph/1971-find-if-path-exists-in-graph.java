class Solution {

    static int vis[];
    static ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
    public static void dfs(int node, int dest)
    {
        vis[node]=1;
        for(int i=0; i<adj.get(node).size(); i++)
        {
            if(vis[adj.get(node).get(i)]==0)
            {
                dfs(adj.get(node).get(i),dest);
            }
        }
    }
    

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        adj=new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            adj.add(new ArrayList<>());
        }
    for(int i=0; i<edges.length; i++)
    {
        int u, v;
        u=edges[i][0];
        v=edges[i][1];
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    vis=new int[n];
    Arrays.fill(vis,0);
    dfs(source,destination);
    if(vis[destination]==1)
    {
        return true;
    }
    return false;
}
}