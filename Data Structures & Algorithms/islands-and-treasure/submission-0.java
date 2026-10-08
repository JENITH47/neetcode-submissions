class Solution {
    class Pair{
        int row;
        int col;
        int cost;
        Pair(int row,int col,int cost){
            this.row=row;
            this.col=col;
            this.cost=cost;
        }
    }
    public void islandsAndTreasure(int[][] grid) {
        Queue<Pair> queue=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0){
                    queue.offer(new Pair(i,j,0));
                }
            }
        }
        while(!queue.isEmpty()){
            int row=queue.peek().row;
            int col=queue.peek().col;
            int cost=queue.peek().cost;
            queue.poll();
            if(row+1<grid.length && grid[row+1][col]!=-1){
                if(cost+1<grid[row+1][col]){
                    grid[row+1][col]=cost+1;
                    queue.offer(new Pair(row+1,col,cost+1));


                }
            }
            if(col+1<grid[0].length && grid[row][col+1]!=-1){
                if(cost+1<grid[row][col+1]){
                    grid[row][col+1]=cost+1;
                    queue.offer(new Pair(row,col+1,cost+1));


                }
            }
            if(row-1>=0 && grid[row-1][col]!=-1){
                if(cost+1<grid[row-1][col]){
                    grid[row-1][col]=cost+1;
                    queue.offer(new Pair(row-1,col,cost+1));


                }
            }
            if(col-1>=0 && grid[row][col-1]!=-1){
                if(cost+1<grid[row][col-1]){
                    grid[row][col-1]=cost+1;
                    queue.offer(new Pair(row,col-1,cost+1));


                }
            }
        }
    

    }
}
