package com.yu.ui;

import javax.swing.*;

public class MyWin {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button=new JButton("OK");
        frame.add(button);
        frame.setVisible(true);
        System.out.println("End?");
    }
}
