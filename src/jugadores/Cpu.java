package jugadores;

import java.util.Random;

import pokemons.Bulbasaur;
import pokemons.Ekans;
import pokemons.Pokemon;
import pokemons.Staryu;

public final class Cpu extends Jugador {
	
	private Random r = new Random();

	public Cpu() {
		super("Gary Oak");
		super.pokemons[0] = new Bulbasaur();
		super.pokemons[1] = new Staryu();
		super.pokemons[2] = new Ekans();
	}
	
	@Override
	public void atacar(Pokemon oponente) {
		
		int opc = 0;
		
		do {
			opc = r.nextInt(4);				
			
			if(super.getPokemon().getAtaque(opc).getCantUsos()!=0) {
				super.getPokemon().atacar(opc,oponente);
			}
			
		} while(super.getPokemon().getAtaque(opc).getCantUsos()==0);
	}
	
}
