class Solution {
    public int numIslands(char[][] grid) {
      if(grid==null||grid.length==0){
        return 0;
      }
      int co=0;
      int r=grid.length;
      int c=grid[0].length;
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(grid[i][j]=='1'){
                co++;
                fill(grid,i,j);
            }
        }
      }
      return co;

    }
    public void fill(char[][] grid,int i,int j){
        int r0=grid.length;
        int c0=grid[0].length;
        if(i<0||j<0||i>=r0|j>=c0||grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        fill(grid,i-1,j);
        fill(grid,i+1,j);
        fill(grid,i,j+1);
        fill(grid,i,j-1);
    }
       
}