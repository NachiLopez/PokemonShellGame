package pokemons;

import ataques.Gru�ido;
import ataques.Impactrueno;
import ataques.Latigo;
import ataques.OndaTrueno;
import tipos.Electrico;

public final class Pikachu extends Pokemon {
	
	public Pikachu() {
		super.nombre = "Pikachu";
		super.vida = 800;
		super.tipo = new Electrico();
		//ataques
		super.ataques[0] = new Latigo();
		super.ataques[1] = new Impactrueno();
		super.ataques[2] = new Gru�ido();
		super.ataques[3] = new OndaTrueno();
	}

}
