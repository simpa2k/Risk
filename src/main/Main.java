package main;

import window.Window;

import javax.swing.*;

/**
 * Created by simpa2k on 2016-07-16.
 */
public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Window window = new Window();
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setBounds(50, 50, 1500, 900);
                window.setVisible(true);
            }
        });
    }

}
