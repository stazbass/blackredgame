package com.mygdx.game;

import com.badlogic.gdx.Game;

public class GameMain extends Game {
	MainScreen screen;
	
	public GameMain(){
	}
	
	@Override
	public void create() {
		screen = new MainScreen();
		setScreen(screen);
	}

}
