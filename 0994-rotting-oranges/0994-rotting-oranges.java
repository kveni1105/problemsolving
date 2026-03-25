class Solution {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int fresh=0;
        Queue<int[]>queue=new LinkedList<>();
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(grid[i][j]==2)
                {
                    queue.offer(new int[]{i, j});
                }
                else if(grid[i][j]==1)
                fresh++;
            }
        }
        if(fresh==0)
        return 0;
        int min=0;
        int direction[][]={{1,0},{0,1},{-1,0},{0,-1}};
        while(!queue.isEmpty())
        {
            int size=queue.size();
            boolean change=false;
            for(int i=0; i<size;i++)
            {
                int curr[]=queue.poll();
                for (int[] d : direction) {
                    int ni = curr[0] + d[0];
                    int nj = curr[1] + d[1];
                    if (ni >= 0 && ni < row && nj >= 0 && nj < col && grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;
                        queue.offer(new int[]{ni, nj});
                        fresh--;
                        change = true;
                    }
                }
            }
            if(change)
            min++;
        }
        return (fresh==0)?min:-1;
    }
}