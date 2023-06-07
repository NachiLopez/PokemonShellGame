package pokemons;

import ataques.Fortaleza;
import ataques.PistolaDeAgua;
import ataques.Placaje;
import ataques.RayoBurbuja;
import tipos.Agua;

public final class Staryu extends Pokemon {
	
	public Staryu() {
		super.nombre = "Staryu";
		super.vida = 650;
		super.tipo = new Agua();
		//ataques
		super.ataques[0] = new Placaje();
		super.ataques[1] = new Fortaleza();
		super.ataques[2] = new PistolaDeAgua();
		super.ataques[3] = new RayoBurbuja();
	}

}
