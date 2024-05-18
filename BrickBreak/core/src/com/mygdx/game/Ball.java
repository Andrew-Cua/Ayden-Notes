package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Circle;

public class Ball extends Entity{
    private float velocityX;
    private float velocityY;

    private static Texture texture = new Texture("balls/58-Breakout-Tiles.png");
    private Circle circle = new Circle();
        public Ball(){
            this.width =  25;
            this.length = 25;

            circle = new Circle();
            circle.x = 600;
            circle.y = 100;
            circle.radius = width/2;
        }
    public boolean collision(Entity entity){

        return false;
    }
    @Override
    public void render() {

    }

    @Override
    public void update() {

    }
}
