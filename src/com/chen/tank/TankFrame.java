package com.chen.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/1/7 13:18
 */
public class TankFrame extends Frame {
    public TankFrame(){
        setSize(800,600);
        setResizable(false);
        setTitle("tank war");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("666");
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(200,200,50,50);
    }
}
