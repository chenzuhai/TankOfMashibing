package com.chen.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 从Frame类继承
 *
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/1/7 13:18
 */
public class TankFrame extends Frame {

    int x = 200, y = 200;

    public TankFrame() {
        setSize(800, 600);
        setResizable(false);
        setTitle("tank war");
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.addKeyListener(new MyKeyListener());
    }

    /**
     * 这个方法就是重新画
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.fillRect(x, y ,50, 50);
        if(bL == true){
            x-=speed;
        }else if(bR == true){
            x+=speed;
        }else if(bU == true){
            y-=speed;
        }else if(bD == true){
            y+=speed;
        }
    }

    boolean bL = false;
    boolean bU = false;
    boolean bR = false;
    boolean bD = false;
    int speed = 10;

    /**
     * 键盘监听处理的类
     */
    class MyKeyListener extends KeyAdapter{

        /**
         * 按下设为true
         * @param e
         */
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;
                default:
                    break;
            }
            //x+=30;
            //repaint()会调用paint(Graphics g)
            repaint();
        }

        /**
         * 松开设置为 false
         * @param e
         */
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                default:
                    break;
            }
        }
    }
}
