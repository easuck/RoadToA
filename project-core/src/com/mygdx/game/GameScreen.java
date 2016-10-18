package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;


public class GameScreen implements Screen{
	
	final MyGame game;
	
	TiledMap map;
	OrthogonalTiledMapRenderer renderer;
	OrthographicCamera camera;
	
	private int mapWidth = 20;
	private int mapHeight = 20;
	
	int x, y;
	
	
	Character p1;
	
	//Constructor
	public GameScreen(final MyGame game){
		this.game = game;
		
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, mapWidth, mapHeight);
		
		
		map = new TmxMapLoader().load("map.tmx");
		renderer = new OrthogonalTiledMapRenderer(map, 1/16f);
		
		
		p1 = new Character();
		
		
	}




	@Override
	public void render (float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		camera.update();
		renderer.setView(camera);
		renderer.render();
		p1.render();
		

		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
			p1.move(-1, 0);
		}
		if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
			p1.move(1, 0);
		}
		if(Gdx.input.isKeyPressed(Keys.UP)) {
			p1.move(0, 1);
		}
		if(Gdx.input.isKeyPressed(Keys.DOWN)){
			p1.move(0, -1);
		}
		
		
		

	}
	

	
	@Override
	public void dispose () {
		map.dispose();
		renderer.dispose();
		
		p1.dispose();

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




}
