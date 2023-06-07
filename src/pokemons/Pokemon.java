package pokemons;

import java.util.Random;

import ataques.Ataque;
import tipos.Tipo;

public abstract class Pokemon {
	
	protected String nombre;
	protected int vida;
	protected Tipo tipo;
	protected Ataque[] ataques = new Ataque[4];
	
	private Random r = new Random(); 
	
	public void atacar(int indAtaque, Pokemon oponente) {
		
		int prob = r.nextInt(100)+1;
		
		if(prob < ataques[indAtaque].getPrecision()+1) {
			System.out.println("El pokemon " + this.nombre + " ha usado " + this.ataques[indAtaque].getNombre() + " y ha causado " + this.ataques[indAtaque].getDaño() + " puntos de daño");
			oponente.vida -= ataques[indAtaque].getDaño();
		} else {
			System.out.println("Ha fallado el ataque");
		}
		
		if(ataques[indAtaque].getCantUsos()>0) {
			ataques[indAtaque].restarCantUsos();
		}
		
	}
	
	public void listarAtaques() {
		for (int i = 0; i < ataques.length; i++) {
			Ataque ataque = ataques[i];
			System.out.println((i+1) + ") " + ataque.getNombre() + " daño: " + ataque.getDaño() + " cant: " + ((ataque.getCantUsos()>=0)?ataque.getCantUsos():"infinito"));
		}
	}
	
//-------------------------------
	
	public String getNombre() {
		return nombre;
	}
	
	public int getVida() {
		return vida;
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public Ataque getAtaque(int indAtaque) {
		if((indAtaque>=0)&&(indAtaque<ataques.length)) {
			return this.ataques[indAtaque];
		}
		return null;
	}
	
	public int getCantAtaques() {
		return ataques.length;
	}

}
