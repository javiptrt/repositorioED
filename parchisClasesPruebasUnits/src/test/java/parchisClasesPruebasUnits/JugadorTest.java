/**
 * 
 */
package parchisClasesPruebasUnits;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */
public class JugadorTest {
	
	static Jugador jugador;
	static Tablero tablero;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		tablero = new Tablero();
		jugador = new Jugador("Pepe", tablero);
		
	}
		
	@Test
	public final void consultarTableroTest() {
	
		int resultado = 0;
		try {
			
			resultado = jugador.consultarTablero(); 
			
		}catch(Exception e) {
			
			fail("El metodo consultarTablero lanza una excepcion al consultar el"
					+ " tablero con la ficha en la casilla 0: "+e.getMessage());
			
		}
			
		for(int i=0; i<tablero.consultarNumCasillas()-1; i++) {
					
			assertEquals(i, resultado);					
			tablero.cambiarFicha(i, i+1);
			
			try {
				
				resultado = jugador.consultarTablero();
				
			}catch(Exception e) {
				
				fail("El metodo consultarTablero lanza una excepcion al consultar el"
						+ " tablero con la ficha en la casilla "+i+1+": "+e.getMessage());
				
			}
															
		}	
				
		assertEquals(19, resultado);
				
	}	
	
}
