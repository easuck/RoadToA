package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class MainMenuScreen implements Screen {
	
	final MyGame game;
	
	OrthographicCamera camera;
	
	Stage stage;
	Skin skin;
	
	
	//Constructor
	public MainMenuScreen(final MyGame game){
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 400, 400);
		
		skin = new Skin(Gdx.files.internal("uiskin.json"));
		TextButton buttonStart = new TextButton("START", skin);
		buttonStart.setWidth(100);
		buttonStart.setHeight(50);
		buttonStart.setPosition(320 / 2 - 100 / 2, 320 - 50 * 2);
		buttonStart.addListener(new ClickListener(){
			public void clicked(InputEvent event, float x, float y){
				super.clicked(event, x, y);
				game.setScreen(new GameScreen(game));
			}
		});
		
		
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		stage.addActor(buttonStart);
	}
	
	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
		
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
