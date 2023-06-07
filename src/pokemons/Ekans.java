package pokemons;

import ataques.Constriccion;
import ataques.Malicioso;
import ataques.Mordisco;
import ataques.PolvoVenenoso;
import tipos.Veneno;

public final class Ekans extends Pokemon {
	
	public Ekans() {
		super.nombre = "Ekans";
		super.vida = 770;
		super.tipo = new Veneno();
		//ataques
		super.ataques[0] = new Constriccion();
		super.ataques[1] = new Malicioso();
		super.ataques[2] = new PolvoVenenoso();
		super.ataques[3] = new Mordisco();
	}

}
