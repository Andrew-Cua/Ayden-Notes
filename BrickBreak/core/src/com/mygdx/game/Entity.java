package com.mygdx.game;
public abstract class Entity {
        protected float x;
        protected float y;
        protected float width;
        protected float length;

        public abstract void render();
        public abstract void update();
}
