package pokemons;

import ataques.Arañazo;
import ataques.Ascuas;
import ataques.Gruñido;
import ataques.PantallaDeHumo;
import tipos.Fuego;

public final class Charmander extends Pokemon {
	
	public Charmander() {
		super.nombre = "Charmander";
		super.vida = 750;
		super.tipo = new Fuego();
		//ataques
		super.ataques[0] = new Arañazo();
		super.ataques[1] = new Gruñido();
		super.ataques[2] = new Ascuas();
		super.ataques[3] = new PantallaDeHumo();
	}

}
