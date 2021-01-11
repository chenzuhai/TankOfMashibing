package com.chen.tank;

import java.awt.*;

/**
 * 子弹
 *
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/1/11 11:48
 */
public class Bullet {

    /**
     * 位置
     */
    private int x, y;
    /**
     * 方向
     */
    private Dir dir;
    /**
     * 速度
     */
    private static final int SPEED = 10;
    /**
     * 子弹大小
     */
    private static int WIDTH = 20, HEIGHT = 20;
    /**
     * 是否存活
     */
    private boolean live = true;
    /**
     * 持有外部frame对象
     */
    private TankFrame tf = null;


    public Bullet(int x, int y, Dir dir, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
    }

    public void paint(Graphics g) {
        if(!live){
            tf.bullets.remove(this);
        }

        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillRect(x, y, WIDTH, HEIGHT);
        g.setColor(c);
        move();
    }

    private void move() {

        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            default:
                break;
        }

        if (x < 0 || y < 0 || x > TankFrame.GAME_WIDTH || y > TankFrame.GAME_HEIGHT) {
            setLive(false);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Dir getDir() {
        return dir;
    }

    public void setDir(Dir dir) {
        this.dir = dir;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
