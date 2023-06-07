package jugadores;

import pokemons.Pokemon;

public abstract class Jugador {
	
	private String nombre;
	protected Pokemon[] pokemons = new Pokemon[3];	
	private int pokemonActivo = 0;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean cambiarPokemon() {
		if(pokemonActivo<pokemons.length-1) {
			pokemonActivo++;
			return false;
		}
		return true;		
	}

	public String getNombre() {
		return nombre;
	}
	
	public Pokemon getPokemon() {
		return this.pokemons[pokemonActivo];
	}
	
	public void atacar(Pokemon oponente) {		
		
	}

	
	
}
