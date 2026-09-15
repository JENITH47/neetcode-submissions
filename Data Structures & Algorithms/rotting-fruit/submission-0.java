class Solution {
    int max=0;
    int fresh=0;
    class Pair{
        int row;
        int col;
        int tm;
        Pair(int row,int col,int tm){
            this.row=row;
            this.col=col;
            this.tm=tm;
        }
    }
    public void traverse(Queue<Pair> queue,int[][] grid){
        while(!queue.isEmpty()){
            int r =queue.peek().row;
            int c=queue.peek().col;
            int t=queue.peek().tm;
            
            max=Math.max(max,t);
            queue.poll();
            if(r-1>=0 && grid[r-1][c]==1){
                fresh--;
                grid[r-1][c]=2;
                queue.offer(new Pair(r-1,c,t+1));

            }
            if(c-1>=0 && grid[r][c-1]==1){
                fresh--;
                grid[r][c-1]=2;
                queue.offer(new Pair(r,c-1,t+1));
                
            }
            if(r+1<grid.length && grid[r+1][c]==1){
                fresh--;
                grid[r+1][c]=2;
                queue.offer(new Pair(r+1,c,t+1));
                
            }
            if(c+1<grid[r].length && grid[r][c+1]==1){
                fresh--;
                grid[r][c+1]=2;
                queue.offer(new Pair(r,c+1,t+1));
                
            }
            // traverse(queue,grid)
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue=new LinkedList<>();
        // int frsh
        
        for(int i=0;i<grid.length;i++){
             for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    queue.offer(new Pair(i,j,0));
                }
                if(grid[i][j]==1){
                    fresh++;
                }

             }
        }
        traverse(queue,grid);
        if(fresh>0){
            return -1;
        }
        return max;
    }
}
