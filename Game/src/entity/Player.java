package entity;

import main.GamePanel;
import main.KeyHandler;

import java.awt.*;

public class Player extends Entity{
    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH){
        this.gp = gp;
        this.keyH = keyH;
        setDefaultValues();
    }

    public void setDefaultValues(){
        x=100;
        y=100;
        speed=10;
    }

    public void update(){
        if(keyH.up==true){
            y-=speed;
        }
        if(keyH.down==true){
            y+=speed;
        }
        if(keyH.left==true){
            x-=speed;
        }
        if(keyH.right==true){
            x+=speed;
        }

    }

    public void draw(Graphics2D g2){
        g2.setColor(Color.white);
        g2.fillRect(x, y, gp.tileSize, gp.tileSize);


    }
}