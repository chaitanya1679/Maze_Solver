package org.example;

import javax.swing.JFrame;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class NewClass extends JFrame {
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
    }

    @Override
    public void paint(Graphics g) {
        g.translate(50,50);
        super.paint(g);
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length; j++) {
                Color color;
                if (maze[i][j] == 1) color = Color.BLACK;
                else if (maze[i][j] == 9) color = Color.RED;
                else color = Color.WHITE;
            g.setColor(color);
            g.fillRect(30 * j, 30 * i, 30, 30);
            g.setColor(Color.RED);
            g.drawRect(30 * j, 30 * i, 30, 30);
        }
    }
}
    public static void main(String[] args) {
        NewClass view = new NewClass();
        view.setVisible(true);
    }
}
