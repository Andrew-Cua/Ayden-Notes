package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class BrickBreak extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Texture brick;
	Texture paddleTex;
	Texture ball;

	float paddleX = 0;
	int paddleY = 0;

	private Rectangle paddle;
	@Override
	public void create () {
		batch = new SpriteBatch();
		brick = new Texture("bricks/01-Breakout-Tiles.png");
		paddleTex = new Texture("paddles/52-Breakout-Tiles.png");
		ball = new Texture("balls/58-Breakout-Tiles.png");

		paddle = new Rectangle();
		paddle.x = 25;
		paddle.y = 25;
		paddle.width = 100;
		paddle.height = 26;
		
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);

		if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) paddle.x -= 400 * Gdx.graphics.getDeltaTime();
		if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) paddle.x += 400 * Gdx.graphics.getDeltaTime();

		/* render textures */
		batch.begin();
		batch.draw(brick, 50, 100, 80, 26);
		batch.draw(ball, 50, 50, 25, 25);
		batch.draw(paddleTex, paddle.x, paddle.y, 100, 26);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
