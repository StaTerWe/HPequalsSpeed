package com.bb.game.elementos;

import com.bb.bmi.objetos.Objeto;
import com.bb.bmi.utiles.BMI;

public class Inventario {

	private Objeto objetos[];
	private int cantObjetos = 0;

	public Inventario() {
		objetos = new Objeto[6];
	}

	public void usarObjeto(int pos) {
		objetos[pos].Usar(BMI.bmi.getJugador());
		if (objetos[pos].getUsos() == 0) {
			soltar(pos);
		}
	}

	public void agarrar(Objeto obj) {
		if (cantObjetos != objetos.length) {
			objetos[cantObjetos] = obj;
			sumarObjeto();
		}
	}

	public void soltar(int pos) {
		objetos[pos] = null;
		ordenarInventario(pos);
		restarObjeto();
	}

	public void ordenarInventario(int pos) {
		do {
			objetos[pos] = objetos[++pos];
			objetos[pos] = null;
		} while (objetos.length != pos + 1 && objetos[pos + 1] != null);

	}

	public void sumarObjeto() {
		cantObjetos++;
	}

	public void restarObjeto() {
		cantObjetos--;
	}

	public Objeto[] getObjetos() {
		return objetos;
	}

	public void setObjetos(Objeto[] objetos) {
		this.objetos = objetos;
	}

	public int getCantObjetos() {
		return cantObjetos;
	}

}
