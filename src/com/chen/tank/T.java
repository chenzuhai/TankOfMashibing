package com.chen.tank;


/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/1/7 13:03
 */
public class T {

    public static void main(String[] args) {
        TankFrame tf = new TankFrame();
        while (true) {
            try {
                Thread.sleep(10);
                tf.repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
