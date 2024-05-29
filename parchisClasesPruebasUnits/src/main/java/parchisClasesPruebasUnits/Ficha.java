package parchisClasesPruebasUnits;

public class Ficha {
    private int posicion;

    public Ficha() {
        this.posicion = 0;
    }

    public int getPosicion() {
        return posicion;
    }

    public void mover(int pasos) {
        this.posicion += pasos;
    }
}