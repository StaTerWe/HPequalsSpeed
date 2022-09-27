package com.bb.game.utiles;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public abstract class Camara {
	public static OrthographicCamera camara= new OrthographicCamera(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	public static Viewport viewport= new FitViewport(640, 480, camara);


}
