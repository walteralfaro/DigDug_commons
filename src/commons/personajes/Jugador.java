package commons.personajes;

import commons.Ubicable;

public class Jugador extends Ubicable {

	private int puntaje;
	private int nombre;

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	private int moverseAbajo(){
		return 1;	
	}
	private int moverseArriba(){
		return 2;	
	}
	private int moverseDerecha(){
		return 3;	
	}
	private int moverseIzquierda(){
		return 4;	
	}
}
