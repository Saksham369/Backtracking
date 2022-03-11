package com.backtracking;
//Backtracking use recursion to explore all the possibilities and then come up with the best solution for the problem
//maze questions are asked in MAANG.

public class Maze {
    public static void main(String[] args) {
        count(3,3, "");
    }

    static  void count(int r , int c, String p){
        if(r == 1 && c==1){
            System.out.println(p);
            return;
        }
        



         if(r >= 1){
         count(r-1,c,p + "D");}
         if(c >= 1){
        count(r, c-1, p + "R");}

    }
}
