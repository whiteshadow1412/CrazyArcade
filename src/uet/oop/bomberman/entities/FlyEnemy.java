/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uet.oop.bomberman.entities;

import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class FlyEnemy extends MoveEntity {
    public FlyEnemy(int x, int y, int orient, int speed) {
        this.x = x;
        this.y = y;
        this.orient = orient;
        this.speed = speed;
        this.runBomb = Bomber.cant_run;
        this.img = new ImageIcon(getClass().getResource("/sprites1/flymonster_down.png")).getImage();
        this.width = 45;
        this.height = 63;
    }

    public void showFlyEnemy(Graphics2D graphics2d) {
        graphics2d.drawImage(img, x, y - 18, 45,63,null);
    }

    @Override
    public void changeOrient(int orient) {
        super.changeOrient(orient);
        switch(orient) {
            case LEFT:
                img = new ImageIcon(getClass().getResource("/sprites1/flymonster_left.png")).getImage();
                break;
            case RIGHT:
                img = new ImageIcon(getClass().getResource("/sprites1/flymonster_right.png")).getImage();
                break;
            case UP:
                img = new ImageIcon(getClass().getResource("/sprites1/flymonster_up.png")).getImage();
                break;
            case DOWN:
                img = new ImageIcon(getClass().getResource("/sprites1/flymonster_down.png")).getImage();
                break;
            default:
                break;
        }
    }

    @Override
    public boolean move(int count, ArrayList<Wall> arrWall, ArrayList<Brick> arrBrick, ArrayList<Bomb> arrBomb) {
        if (count % speed != 0) {
            return true;
        }
        switch(orient) {
            case DOWN:
                if (y >= 587 - height) {
                    return false;
                }
                y = y + 1;
                break;
            case LEFT:
                if (x <= 45) {
                    return false;
                }
                x = x - 1;
                break;
            case RIGHT:
                if (x > 1367 - width) {
                    return false;
                }
                x = x + 1;
                break;
            case UP:
                if (y <= 45) {
                    return false;
                }
                y = y - 1;
                break;
            default:
                break;
        }
        return true;
    }
}
