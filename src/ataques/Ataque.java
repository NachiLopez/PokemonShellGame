package ataques;

public abstract class Ataque {

	private String nombre;
	private int daño;
	private int precision;
	private int cantUsos;
	
	public Ataque(String nombre, int daño, int precision, int cantUsos) {
		this.nombre = nombre;
		this.daño = daño;
		this.precision = precision;
		this.cantUsos = cantUsos;
	}
	
	public int getPrecision() {
		return precision;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getDaño() {
		return daño;
	}
	
	public void restarCantUsos() {
		this.cantUsos--;
	}
	
	public int getCantUsos() {
		return cantUsos;
	}
	
}
