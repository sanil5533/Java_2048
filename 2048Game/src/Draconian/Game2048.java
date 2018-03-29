package Draconian;
/**
 * Created by draco_nian on 5/20/2017.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;
import java.io.*;

public class Game2048 extends JPanel {

    public static void main(String args[])
    {
        JFrame game=new JFrame();
        game.setTitle("2048");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(340,400);
        game.setResizable(false);

        game.add(new Game());
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }


}
