package com.mygdx.game;

import com.badlogic.gdx.Game;

public class MyGame extends Game{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		this.setScreen(new MainMenuScreen(this));
	}
	
	public void render(){
		super.render();
	}
	
	
	
	
	
}
