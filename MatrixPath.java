package com.backtracking;
import java.util.*;

public class MatrixPath {
    // take a step variable
    //update the path array
    //print it in base condition

    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int path[][] = new int[board.length][board[0].length];
        allPath ( "", board,  0,  0,path,1);
    }
    static void allPath(String p, boolean[][] maze, int r, int c,int[][] path, int step ) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
          path[r][c] = step;
           for(int[] j : path){
               System.out.println(Arrays.toString(j));
           }
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        path[r][c] = step;
        maze[r][c] = false;//considering this block in my path

        if (r < maze.length - 1) {
            allPath( p + 'D', maze, r+1, c,path,step +1);
        }
        if (c < maze[0].length - 1) {
            allPath( p + 'R', maze, r,  c+1,path,step+1);
        }

        if (r > 0) {
            allPath ( p + 'U', maze,r-1, c,path,step+1);
        }

        if (c > 0) {
            allPath( p + 'L', maze, r,  c-1,path,step+1);
        }

        //this is the line where function will be over
        //so before the function is removed, also remove the changes made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }


}
