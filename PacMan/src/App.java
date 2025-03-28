import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;
public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int colCount = 19;
        int titleSize= 32;
        int boardWidth=colCount * titleSize;
        int boardHight= rowCount* titleSize;

        JFrame frame = new JFrame("PacMan");
        frame.setSize(boardWidth, boardHight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        frame.setVisible(true);
        pacmanGame.requestFocusInWindow();

    }
}
