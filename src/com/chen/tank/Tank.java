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
    private static final int SPEED = 1;

    public Tank(int x, int y, Dir dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
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
        g.fillRect(x, y, 50, 50);

        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y-=SPEED;
                break;
            case DOWN:
                y+=SPEED;
                break;
            default:
                break;
        }
    }
}
