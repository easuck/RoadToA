package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Character {
	
	protected Texture texture;
	protected Rectangle player;
	
	SpriteBatch batch;
	
	//Constructor
	public Character(){
		texture = new Texture(Gdx.files.internal("player.png"));
		player = new Rectangle();
		player.x = 0;
		player.y = 0;
		player.width = 16;
		player.height = 16;
		
		batch = new SpriteBatch();
	}
	
	public float getX(){
		return player.x;
	}
	
	public float getY(){
		return player.y;
	}
	
	public void move(float x, float y){
		player.x += x;
		player.y += y;
		if (player.x < 0) {
			player.x = 0;
		}
		if (player.x > 320 - 16) {
			player.x = 320 - 16;
		}
		if (player.y < 0) {
			player.y = 0;
		}
		if (player.y > 320 - 16) {
			player.y = 320 - 16;
		}
		
	}
	
	public Texture getTexture(){
		return texture;
	}
	
	public SpriteBatch getBatch(){
		return batch;
	}
	
	public void render(){
		
		
		batch.begin();
		batch.draw(texture, player.x, player.y);
		batch.end();
	}
	
	public void dispose(){
		texture.dispose();
		batch.dispose();
	}

	
	



}
