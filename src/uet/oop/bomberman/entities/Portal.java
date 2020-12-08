/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uet.oop.bomberman.entities;

import javax.swing.ImageIcon;
import java.awt.*;


public class Portal extends Item {
    public Portal(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        this.img = new ImageIcon(getClass().getResource("/sprites1/Portal.png")).getImage();
        this.width = 45;
        this.height = 45;
        this.time = 250;
    }

    @Override
    public void showItem(Graphics2D graphics2d) {
        graphics2d.drawImage(img, x, y,45,45,null);
    }
}

