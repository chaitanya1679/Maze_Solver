package org.example;


import java.util.List;

public class DFS {
    public static boolean pathsearch(int[][] maze, int x, int y, List<Integer> path){
        if(maze[y][x]==9){//we reched the end point
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[y][x]==0){//we can move in
            maze[y][x]=2;
            int dx=-1;
            int dy=0;
            if (pathsearch(maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx=1;
            dy=0;
            if (pathsearch(maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx=0;
            dy=-1;
            if (pathsearch(maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx=0;
            dy=1;
            if (pathsearch(maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
}
