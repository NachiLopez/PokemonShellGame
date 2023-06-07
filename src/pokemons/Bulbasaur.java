package pokemons;

import ataques.Gruñido;
import ataques.LatigoCepa;
import ataques.Placaje;
import ataques.PolvoVenenoso;
import tipos.Planta;

public final class Bulbasaur extends Pokemon {
	
	public Bulbasaur() {
		super.nombre = "Bulbasaur";
		super.vida = 850;
		super.tipo = new Planta();
		//ataques
		super.ataques[0] = new Placaje();
		super.ataques[1] = new Gruñido();
		super.ataques[2] = new LatigoCepa();
		super.ataques[3] = new PolvoVenenoso();
	}

}
