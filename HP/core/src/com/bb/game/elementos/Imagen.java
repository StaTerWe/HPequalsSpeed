package com.bb.game.elementos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Imagen {
	private Texture img;
	private TextureRegion textura;
	private float X = 0, Y = 0, multX = 1, multY = 1;

	public Imagen(String dir) {
		this.img = new Texture(dir);
		textura = new TextureRegion(img);
	}

	public void draw(SpriteBatch batch) {
		batch.draw(textura, X, Y, textura.getRegionWidth() * multX, textura.getRegionHeight() * multY);
	}

	public Texture getImg() {
		return img;
	}

	public TextureRegion getTextura() {
		return textura;
	}

	public float getX() {
		return X;
	}

	public void setX(float x) {
		X = x;
	}

	public float getY() {
		return Y;
	}

	public void setY(float y) {
		Y = y;
	}

	public float getMultX() {
		return multX;
	}

	public void setMultX(float multX) {
		this.multX = multX;
	}

	public float getMultY() {
		return multY;
	}

	public void setMultY(float multY) {
		this.multY = multY;
	}

}
