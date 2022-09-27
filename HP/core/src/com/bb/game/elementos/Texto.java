package com.bb.game.elementos;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.math.Vector2;

public class Texto {
	private BitmapFont font = new BitmapFont();
	private float x = 0;
	private float y = 0;
	private String texto = "Missing text";
	private GlyphLayout layout;
	private int fontSize = 0;

	/**
	 * Se utiliza para la creacion, configuraci�n y utilizaci�n de fuentes
	 * personalizadas(ttf)
	 * 
	 * @param fuente      Direccion de la fuente a utilizar
	 * @param tamanio      Tamanio de la fuente
	 * @param colorFuente Color de la fuente
	 * @param colorBorde  Color del borde de la fuente
	 * @param tamanioBorde Tamanio del borde de la fuente
	 */
	public Texto(String fuente, int tamanio, Color colorFuente, Color colorBorde, int tamanioBorde) {
		FreeTypeFontGenerator generador = new FreeTypeFontGenerator(Gdx.files.internal(fuente));
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		setFontSize(tamanio);
		// Parametros del generador de fuentes
		parameter.size = tamanio;
		parameter.color = colorFuente;
		parameter.borderColor = colorBorde;
		parameter.borderWidth = tamanioBorde;
		parameter.borderStraight = true;
		font = generador.generateFont(parameter);
		layout = new GlyphLayout();
	}

	public void draw(SpriteBatch batch) {
		font.draw(batch, texto, x, y);
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setPosition(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public void setTexto(String texto) {
		this.texto = texto;
		layout.setText(font, texto);
	}

	public float getWidth() {
		return layout.width;
	}

	public float getHeight() {
		return layout.height;
	}

	public Vector2 getSizeVec() {
		return new Vector2(getWidth(), getHeight());
	}

	public Vector2 getPositionVec() {
		return new Vector2(getWidth(), getHeight());
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setColor(Color color) {
		this.font.setColor(color);
	}
}
