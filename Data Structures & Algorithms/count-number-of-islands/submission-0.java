class Solution {
    public void traverse(boolean[][] visited,int i,int j,char[][] grid){
        visited[i][j]=true;
        
        if(i+1<=grid.length-1 && grid[i+1][j]=='1' && !visited[i+1][j]){
            traverse(visited,i+1,j,grid);

        }
        if(j+1<=grid[i].length-1 && grid[i][j+1]=='1'&& !visited[i][j+1]){
            traverse(visited,i,j+1,grid);
        }
        if(i-1>=0 && grid[i-1][j]=='1'&& !visited[i-1][j]){
            traverse(visited,i-1,j,grid);
        }
         if(j-1>=0 && grid[i][j-1]=='1'&& !visited[i][j-1]){
            traverse(visited,i,j-1,grid);
        }
        
    }
    public int numIslands(char[][] grid) {
        boolean[][] visited=new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++)
            if(!visited[i][j] && grid[i][j]=='1'){
                count++;
                traverse(visited,i,j,grid);
            }
        }
        return count;


    }
}
