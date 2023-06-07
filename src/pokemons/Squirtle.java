package pokemons;

import ataques.Burbuja;
import ataques.Latigo;
import ataques.PistolaDeAgua;
import ataques.Placaje;
import tipos.Agua;

public final class Squirtle extends Pokemon {
	
	public Squirtle() {
		super.nombre = "Squirtle";
		super.vida = 720;
		super.tipo = new Agua();
		//ataques
		super.ataques[0] = new Placaje();
		super.ataques[1] = new Latigo();
		super.ataques[2] = new Burbuja();
		super.ataques[3] = new PistolaDeAgua();
	}

}
