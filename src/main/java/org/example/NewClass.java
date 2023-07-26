package org.example;

import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class NewClass extends JFrame {
    //maze grid
    private int[][] maze =
            {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,},
                    {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
                    {1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1},
                    {1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1},
                    {1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1},
                    {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1},
                    {1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1},
                    {1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1},
                    {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 9, 1},
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            };
    public List<Integer> path = new ArrayList<>();

    public NewClass() {
        setTitle("Maze");
        setSize(640, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DFS.pathsearch(maze,0,0,path);
        //System.out.println(path); //to see if path is working or not
    }

    @Override
    public void paint(Graphics g) {
        g.translate(50,50);//starting point of maze
        super.paint(g);
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                Color color;
                if (maze[i][j] == 1) color = Color.DARK_GRAY;
                else if (maze[i][j] == 9) color = Color.YELLOW;
                else color = Color.WHITE;
            g.setColor(color);//setting inner squares color
            g.fillRect(30 * j, 30 * i, 30, 30);//size of innersquares
            g.setColor(Color.GREEN);//setting color of edges of inner squares
            g.drawRect(30 * j, 30 * i, 30, 30);//drawing on the edges on inner squares
        }
    }
        for(int i=0;i<path.size();i+=2){
            int pathx=path.get(i);
            int pathy=path.get(i+1);
            System.out.println("X coordinates"+pathx);
            System.out.println("Y coordinates"+pathy);
            g.setColor(Color.BLUE);
            g.fillRect(30*pathx,30*pathy,30,30);
        }
}
    public static void main(String[] args) {
        NewClass view = new NewClass();
        view.setVisible(true);
    }
}

