package pokemons;

import ataques.Ara�azo;
import ataques.Ascuas;
import ataques.Gru�ido;
import ataques.PantallaDeHumo;
import tipos.Fuego;

public final class Charmander extends Pokemon {
	
	public Charmander() {
		super.nombre = "Charmander";
		super.vida = 750;
		super.tipo = new Fuego();
		//ataques
		super.ataques[0] = new Ara�azo();
		super.ataques[1] = new Gru�ido();
		super.ataques[2] = new Ascuas();
		super.ataques[3] = new PantallaDeHumo();
	}

}
