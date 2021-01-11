package com.chen.tank;

import java.awt.*;

/**
 * @author Zuhai Chen
 * @version 1.0
 * @date 2021/1/11 11:03
 */
public class Tank {

    /**
     * 位置
     */
    private int x, y;
    /**
     * 方向
     */
    private Dir dir = Dir.DOWN;
    /**
     * 速度
     */
    private static final int SPEED = 5;
    /**
     * 是否移动
     */
    private boolean moving = false;

    /**
     * 持有外部frame对象
     */
    private TankFrame tf = null;

    public Tank(int x, int y, Dir dir, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
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

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, 50, 50);
        g.setColor(c);
        move();
    }

    private void move() {
        if (!moving) {
            return;
        }

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
    }

    public void fire() {
        tf.bullets.add(new Bullet(x, y, dir,tf));
    }
}
