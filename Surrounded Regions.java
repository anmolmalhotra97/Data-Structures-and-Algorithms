class Solution {
    
    boolean seen = true;

    public void dfs(char[][] board, int i, int j, int r, int c, boolean[][] isVisited)
    {
        if(i < 0 || i > r-1 || j < 0 || j > c-1)
            return;
        if(board[i][j] == 'X' || isVisited[i][j])
            return;
        if(i <= 0 || i >= r-1 || j <= 0 || j >= c-1)
            seen = true;
        isVisited[i][j] = true;
        dfs(board, i-1, j, r, c, isVisited); //top
        dfs(board, i, j+1, r, c, isVisited); //right
        dfs(board, i, j-1, r, c, isVisited); //left
        dfs(board, i+1, j, r, c, isVisited); //down
    }
    
    public void mark(char[][] board, int i, int j, int r, int c)
    {
        if(i < 0 || i > r-1 || j < 0 || j > c-1)
            return;    
        if(board[i][j] == 'X')
            return;
        
        board[i][j] = 'X';
        mark(board, i-1, j, r, c); //top
        mark(board, i, j+1, r, c); //right
        mark(board, i, j-1, r, c); //left
        mark(board, i+1, j, r, c); //down
    }
    
    public void solve(char[][] board) {
        if(board.length < 1 || board[0].length <=1)
            return;
        
        int row = board.length;
        int col = board[0].length;
        boolean[][] isVisited = new boolean[row][col];
        
        for(int i = 0; i < row - 1; i++)
        {
            for (int j = 0; j < col-1; j++)
            {
                isVisited[i][j] = false;
            }
        }
        
        for(int i = 1; i < row-1; i++)
        {
            for (int j = 1; j < col-1; j++)
            {
                if(board[i][j] == 'O' && !isVisited[i][j])
                {
                    seen = false;
                    dfs(board, i, j, row, col, isVisited);
                    if(seen == false)
                    {
                        mark(board, i, j, row, col);
                    }
                    seen = true;
                }
            }
        }
        
    }
}

//Faster Method DFS called only once

// class Solution {
    
//     boolean seen = true;

//     public void dfs(char[][] board, int i, int j)
//     {
//         if(board[i][j] == 'O')
//         {
//             board[i][j] = '1';
//             if((i+1) < board.length)
//                 dfs(board, i+1, j); //down
//             if(i > 1)
//                 dfs(board, i-1, j); // up
//             if((j+1) < board[0].length)
//                 dfs(board, i, j+1); // right
//             if(j > 1)
//                 dfs(board, i, j-1); //left
//         }
//     }
        
//     public void solve(char[][] board) {
//         if(board.length < 1 || board[0].length <=1)
//             return;
        
//         int row = board.length;
//         int col = board[0].length;
        
//         // first-col and last-col
//         for(int i = 0; i < row; i++)
//         {
//             dfs(board, i, 0);
//             dfs(board, i, col-1);
//         }
        
//         // first-row and last-row
//         for(int j = 0; j < col; j++)
//         {
//             dfs(board, 0, j);
//             dfs(board, row-1, j);
//         }
        
//         for(int i = 0; i < board.length; i++)
//         {
//             for(int j = 0; j < board[0].length; j++)
//             {
//                 if(board[i][j] == 'O')
//                     board[i][j] = 'X';
//                 if(board[i][j] == '1')
//                     board[i][j] = 'O';
//             }
//         }
//     }
// }