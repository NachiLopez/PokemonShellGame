package jugadores;

import java.util.Scanner;

import pokemons.Charmander;
import pokemons.Pikachu;
import pokemons.Pokemon;
import pokemons.Squirtle;
import utilidades.Utiles;

public final class Usuario extends Jugador {
	
	private Scanner s = new Scanner(System.in);
	
	public Usuario(String nombre) {
		super(nombre);
		super.pokemons[0] = new Pikachu();
		super.pokemons[1] = new Charmander();
		super.pokemons[2] = new Squirtle();
	}
	
	@Override
	public void atacar(Pokemon oponente) {
		int opc=0;
		
		do {
			super.getPokemon().listarAtaques();
			opc = Utiles.ingresarEntero(s,1,super.getPokemon().getCantAtaques())-1;		
			
			if(super.getPokemon().getAtaque(opc).getCantUsos()!=0) {
				super.getPokemon().atacar(opc,oponente);
			} else {
				System.out.println("\nNo dispone de mas usos para este ataque");
			}
			
		} while(super.getPokemon().getAtaque(opc).getCantUsos()==0);
	}
	

}
