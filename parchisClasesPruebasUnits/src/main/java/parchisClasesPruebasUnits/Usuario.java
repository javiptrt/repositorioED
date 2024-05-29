package parchisClasesPruebasUnits;

import parchisClasesPruebasUnits.Dado;
import parchisClasesPruebasUnits.Tablero;

public class Usuario {
    private String nombre;
    private String id;
    private Tablero tablero;
    private Ficha[] fichas;

    public Usuario(String nombre, String id, Tablero tablero) {
        this.nombre = nombre;
        this.id = id;
        this.tablero = tablero;
        this.fichas = new Ficha[]{new Ficha(), new Ficha()}; // Dos fichas por usuario
    }

    public String getNombre() {
        return nombre;
    }

    public void tirarDado(Dado dado) {
        dado.tirar();
    }

    public int consultarDado(Dado dado) {
        return dado.mostrarTirada();
    }

    public void moverFicha(int numFicha, int pasos) {
        fichas[numFicha].mover(pasos);
    }

    public int consultarTablero(int numFicha) {
        return fichas[numFicha].getPosicion();
    }
}