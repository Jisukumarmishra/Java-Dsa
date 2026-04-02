package backTracking;
import java.util.Arrays;

public class allPath {
  // this is backtracking
  public static void main(String[] args) {
    boolean [][] board = {
      {true, true, true},
      {true, true, true},
      {true, true, true}
    };
    int[][] path = new int[board.length][board[0].length];
    allPathMazePrint("", board, 0, 0, path, 1);
  }
 
  static void allPathMaze (String p,boolean[][] maze, int r,int c) {
    if ( r== maze.length-1 && c== maze[0].length -1) { 
      System.out.println(p);
      return ;
    }

    if(!maze[r][c]) {
      return ;
    } 

    // or
    // if (maze[r][c] == false ) {
    //   return ;
    // }
    
    // i am considering this block in my path

    maze[r][c] = false;

    if ( r < maze.length -1 ) {
      allPathMaze(p +'D', maze, r+1, c);
    }

    if (c < maze[0].length-1) {
      allPathMaze(p +'R', maze, r, c+1);
    }
    if ( r >0 ) {
      allPathMaze(p+'U', maze, r-1, c);
    }
    if (c >0 ) {
      allPathMaze(p+'L', maze, r, c-1);
    }
    // this line where the function will over 
    // so before the function gets removed,also removed the changes that were made by the function

    maze[r][c] = true;

  }



  
  static void allPathMazePrint (String p,boolean[][] maze, int r,int c, int [][] path,int steps) {
    
    if ( r== maze.length-1 && c== maze[0].length -1) { 
      path[r][c] = steps;
      // base condation me ham path print karna chahtew hai;
      for (int[] arr: path ) {
      System.out.println(Arrays.toString(arr));
      }
      System.out.println(p);
      System.out.println();
      return ;
    }

    if(!maze[r][c]) {
      return ;
    } 

    // or
    // if (maze[r][c] == false ) {
    //   return ;
    // }
    
    // i am considering this block in my path

    maze[r][c] = false;
    path[r][c] = steps; // start ,me path steps ke equal tha 

    if ( r < maze.length -1 ) {
      allPathMazePrint(p+'D', maze, r+1, c, path, steps+1);
    }

    if (c < maze[0].length-1) {
      allPathMazePrint(p+'R', maze, r, c+1, path, steps+1);
    }
    if ( r >0 ) {
      allPathMazePrint(p+'U', maze, r-1, c, path, steps+1);
    }
    if (c >0 ) {
      allPathMazePrint(p+'V', maze, r, c-1, path, steps+1);
    }
    // this line where the function will over 
    // so before the function gets removed,also removed the changes that were made by the function

    maze[r][c] = true;
    path[r][c] = 0; // last me path 0 ho gya 

  }
  
}
