import java.awt.event.*;
import java.util.Scanner;
import javax.swing.*;
import java.util.Random;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.border.Border;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.JOptionPane;
import java.util.*;

import javax.swing.JTextField;


public class GUI {

    public int jumperX = 10;
    public int jumperY = 10;

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
        start();
    }

    public void start() {

        JTextField keyChecker = new JTextField();


        JFrame mapBase = new JFrame("Main");
        mapBase.setSize(600,600);
        mapBase.setLayout(null);
        mapBase.setVisible(true);

        JLabel jumper = new JLabel("hi");
        jumper.setBounds(10,10,10,10);
        jumper.setVisible(true);
        mapBase.add(jumper);




        keyChecker.addKeyListener(MyKeyListener);


        while (1 == 1) {

            //every quarter second it checks and updates stuff
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                // Stop immediately and go home
            }

            if (jumperY < 200) {
                jumperY = jumperY + 10;
            }

            jumper.setBounds(jumperX,jumperY,10,10);

        }





    }

    KeyListener MyKeyListener = new KeyListener() {
        public void keyPressed (KeyEvent evt){
            if (evt.getKeyChar() == 'a') {
                System.out.println("dd");
            }
        }
        public void keyReleased (KeyEvent evt){
            if (evt.getKeyChar() == 'a') {
                System.out.println("dd");
            }
        }
        public void keyTyped (KeyEvent evt){
            if (evt.getKeyChar() == 'a') {
                System.out.println("dd");
            }
        }
    };

}
