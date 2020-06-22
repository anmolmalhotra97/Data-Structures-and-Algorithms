class Solution {
    public void dfs(char[][] grid, int i, int j, int row, int col)
    {
        if(i < 0 || i >= row || j < 0 || j >= col || grid[i][j]!='1')
            return;
        
        grid[i][j] = 2;
        
        dfs(grid, i, j+1, row, col); //right
        dfs(grid, i+1, j, row, col); //down
        dfs(grid, i, j-1, row, col); //left
        dfs(grid, i-1, j, row, col); //up
    }
    
    public int numIslands(char[][] grid) {
        
        int row = grid.length;
        int col = 0;
        if(row>0)
            col = grid[0].length;
        System.out.println(row+" x "+col);
        int noOfIslands = 0;
        if(row < 1)
            return 0;
        
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                if(grid[i][j] == '1')
                {
                    dfs(grid, i, j, row, col);
                    noOfIslands += 1;
                }
            }
        }
        
        return noOfIslands;
    }
}