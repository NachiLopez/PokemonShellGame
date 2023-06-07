package ataques;

public abstract class Ataque {

	private String nombre;
	private int da�o;
	private int precision;
	private int cantUsos;
	
	public Ataque(String nombre, int da�o, int precision, int cantUsos) {
		this.nombre = nombre;
		this.da�o = da�o;
		this.precision = precision;
		this.cantUsos = cantUsos;
	}
	
	public int getPrecision() {
		return precision;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getDa�o() {
		return da�o;
	}
	
	public void restarCantUsos() {
		this.cantUsos--;
	}
	
	public int getCantUsos() {
		return cantUsos;
	}
	
}
