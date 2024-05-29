/**
 * 
 */
package parchisClasesPruebasUnits;

/**
 * 
 */
public class Juego {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Tablero tablero = new Tablero();
		Dado dado1 = new Dado();
		Jugador jug1 = new Jugador("Javi", tablero);
		Jugador jug2 = new Jugador("Alba", tablero);
		
		do {

			jug1.tirarDado(dado1);
			System.out.println("Ha salido el numero" + jug1.consultarDado(dado1));

		} while (jug1.consultarDado(dado1) != 5);

		jug1.moverFicha(1);
		System.out.println("La ficha sale de casa");
		
		Dado dado2 = new Dado();
		
		int tirada;
		do {

			jug1.tirarDado(dado1);
			jug1.tirarDado(dado2);
			
			tirada = jug1.consultarDado(dado1)+jug1.consultarDado(dado2);
			
			System.out.println("Ha salido el " + tirada);		
			jug1.moverFicha(tirada);
			
			System.out.println("La ficha esta en la casilla "+jug1.consultarTablero());

		} while (jug1.consultarTablero() < tablero.consultarNumCasillas());

		System.out.println("Finaliza el juego");

	}

}
