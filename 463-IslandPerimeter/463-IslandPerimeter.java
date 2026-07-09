// Last updated: 7/9/2026, 9:50:05 AM
class Solution {
    public int islandPerimeter(int[][] grid) {
    int perim=0;
    int row=grid.length;
    int col=grid[0].length;
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==1){
            perim+=4;
             
        
        if(j+1<col && grid[i][j+1]==1){
            perim-=2;
        }
        if(i+1<row && grid[i+1][j]==1){
            perim-=2;
        }
    }   
    } 
    }
    return perim;
    }
}