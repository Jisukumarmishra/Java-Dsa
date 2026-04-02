import java.util.ArrayList;
import java.util.List;

public class Nqueen  { 
    public boolean isSafe(int row, int col, char[][] board ) {
        // horinzontal
        for ( int j = 0; j<board.length; j++ ) {
         if ( board[row][j] == 'q') {
            return false;
         }   
        }
        //vertical
        for (int i = 0 ; i<board[0].length; i++ ) {
         if (board[i][col] == 'q') {
          return false ;

         }
        }
        // upper left
        int r = row;
        for (int c = col; c>=0 && r>=0; c--,r-- ) {
         if ( board[r][c] == 'q' ){
            return false; 
         }
        }
        // upper right 
         r = row;
         for ( int c = col; c<board.length && r >= 0 ; r--, c-- ) {
           if ( board [r][c] == 'q') {
            return false;
           }
         }
         // lower left;
         r = row ; 
         for ( int c = col; c>=0 && r<board.length; r++, c-- ) {
            if ( board [r][c] == 'q' ) {
                return false;
            }
         }
         // lower right 
          r = row;
         for ( int c = 0; c<board.length && r<board.length ; c++, r--  ) {
            if ( board[r][c] =='q') ;
            return false;
              } 
            return true;
        }
    
       public void saveBoard (char[][] board , List<List<String>> allBoards ) {
       String row = "" ;
       List<String> newBoard = new ArrayList<>();
       
       for ( int i = 0; i<board.length; i++ ) {
        row = "";
        for (int j = 0; j<board[0].length; j++ ) {
            if (board[i][j] == 'q' ) 
                row+='q';
                else 
                row+='.';
            }
              newBoard.add(row);
        }
         allBoards.add(newBoard);
       }
    public void helper (char[][]board , List<List<String>> allBoards , int col ) {
       if (col == board.length ) {
        saveBoard(board, allBoards );
        return;
       }
        for (int row = 0; row<board.length;row++ ) {
       if ( isSafe(row, col, board)) {
        board[row][col] = 'q';
        helper(board, allBoards, col+1 ) ;
        board[row][col] = '.';

         }
       } 
    }
    public List<List<String>> solveNQueens ( int n ) {
    List<List<String>> allBoards = new ArrayList<>();
    char[][] board = new  char [n][n];

    helper ( board , allBoards, 0 );
   return allBoards;
}
}  // time complexity is 0(n^n)




