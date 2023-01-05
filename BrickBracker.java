package com.example.brickbracker;
import javax.swing.JFrame;
public class BrickBracker {
    //java swing is library to create GUI
        public static void main(String[] args){
            JFrame obj = new JFrame();  //to create window
            GamePlay gameplay = new GamePlay();
            obj.setSize(700, 600); //width & height
            obj.setTitle("BrickBreaker"); //title
            obj.setLocationRelativeTo(null);
            obj.setResizable(false); //resizable
            obj.setVisible(true); //b
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //operation:
            obj.add(gameplay);
        }

}
