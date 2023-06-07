package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Utiles {

	public static int ingresarEntero(Scanner s, int min, int max) {

		int opc = 0;
		boolean error = false;

		do {
			error = false;
			try {
				opc = s.nextInt();
				s.nextLine();
				if ((opc < min) || (opc > max)) {
					System.out.println("Error. Debe ingresar un numero del " + min + " al " + max);
					error = true;
				}
			} catch (InputMismatchException e) {
				error = true;
				s.nextLine();
				System.out.println("Error. Tipo de dato mal ingresado");
			} catch (Exception e) {
				System.out.println("Error inesperado");
			}
		} while (error);
		return opc;
	}

	public static void esperar(int milis) {
		try {
			Thread.sleep(milis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
