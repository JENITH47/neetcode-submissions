class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row,int col){
            this.row=row;
            this.col=col;}
        }
    public void solve(char[][] grid) {
          Queue<Pair> queue=new LinkedList<>();
         boolean[][] visited=new boolean[grid.length][grid[0].length];
         for(int i=0;i<grid.length;i++){
             if(grid[i][0]=='O'){
                 queue.offer(new Pair(i,0));
                 visited[i][0]=true;
             }
             if(grid[i][grid[i].length-1]=='O'){
                 queue.offer(new Pair(i,grid[i].length-1));
                 visited[i][grid[i].length-1]=true;
             }
         }
          for(int i=0;i<grid[0].length;i++){
             if(grid[0][i]=='O'){
                 queue.offer(new Pair(0,i));
                 visited[0][i]=true;
             }
             if(grid[grid.length-1][i]=='O'){
                 queue.offer(new Pair(grid.length-1,i));
                 visited[grid.length-1][i]=true;
             }
         }
         while(!queue.isEmpty()){
             int row=queue.peek().row;
             int col=queue.peek().col;
             queue.poll();
             if(row+1<grid.length && !visited[row+1][col] && grid[row+1][col]=='O'){
                 visited[row+1][col]=true;
                 queue.offer(new Pair(row+1,col));
             }
             if(col+1<grid[row].length && !visited[row][col+1] && grid[row][col+1]=='O'){
                 visited[row][col+1]=true;
                 queue.offer(new Pair(row,col+1));
             }
             if(row-1>=0 && !visited[row-1][col] && grid[row-1][col]=='O'){
                 visited[row-1][col]=true;
                 queue.offer(new Pair(row-1,col));
             }
             if(col-1>=0 && !visited[row][col-1] && grid[row][col-1]=='O'){
                 visited[row][col-1]=true;
                 queue.offer(new Pair(row,col-1));
             }
         }
         for(int i=0;i<grid.length;i++){
             for(int j=0;j<grid[i].length;j++){
                 if(!visited[i][j]){
                     grid[i][j]='X';
                 }
             }
         }
    }
}
