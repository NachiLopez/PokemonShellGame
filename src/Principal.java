import java.util.Scanner;

import jugadores.Jugador;
import jugadores.Cpu;
import jugadores.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Jugador usuario, cpu;
		boolean fin = false;
		int turno = 0;
		
		
		
		System.out.println("Bienvenidos a la batalla pokemon\n");
		System.out.println("Ingrese su nombre");
		String nombre = s.nextLine();
		usuario = new Usuario(nombre);
		cpu = new Cpu();
		
		do { 
			if(turno==0) {
				System.out.println("\nTurno de " + usuario.getNombre());
				System.out.println("\nPokemon activo: " + usuario.getPokemon().getNombre());
				System.out.println("Vida: " + usuario.getPokemon().getVida() + "\n");				
				usuario.atacar(cpu.getPokemon());	
				
				if(cpu.getPokemon().getVida()<=0) {
					fin = cpu.cambiarPokemon();
					if(fin) {
						System.out.println("Ganaste ! ");
					}
				}
				
				turno = 1;
			} else {
				System.out.println("\nTurno de " + cpu.getNombre());
				System.out.println("\nPokemon activo: " + cpu.getPokemon().getNombre());
				System.out.println("Vida: " + cpu.getPokemon().getVida() + "\n");				
				cpu.atacar(usuario.getPokemon());				
				
				if(usuario.getPokemon().getVida()<=0) {
					fin = usuario.cambiarPokemon();
					if(fin) {
						System.out.println("Perdiste!");
					}
				}
				
				turno = 0;
			}
		}while(!fin);
		
		s.close();
		
	}
	
}
