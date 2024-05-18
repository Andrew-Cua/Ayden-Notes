package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class Paddle extends Entity{
    private float velocityX = 400;
    private static Texture paddleTex = new Texture("paddles/52-Breakout-Tiles.png");
    private Rectangle rect;

    public Paddle() {
        this.width = 100;
        this.length = 26;


        rect = new Rectangle();
        rect.x = 600;
        rect.y = 50;
        rect.width = this.width;
        rect.height = this.length;
    }

    public void movement() {

    }


    @Override
    public void render() {

    }

    @Override
    public void update() {

    }

}
