package MotorDeJuego;

public class Letras extends Facciones{
    protected int ataque;
    protected int defensa;
    protected int rangoMovimiento;
    protected int puntosDeVida;
    protected int rangoAtaque;


    public Letras(String nombre, int ataque, int defensa, int rangoMovimiento, int puntosDeVida, int rangoAtaque) {
        super(nombre);
        this.ataque = ataque;
        this.defensa = defensa;
        this.rangoMovimiento = rangoMovimiento;
        this.puntosDeVida = puntosDeVida;
        this.rangoAtaque = rangoAtaque;
    }

    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    public int getDefensa() {
        return defensa;
    }
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    public int getRangoMovimiento() {
        return rangoMovimiento;
    }
    public void setRangoMovimiento(int rangoMovimiento) {
        this.rangoMovimiento = rangoMovimiento;
    }
    public int getPuntosDeVida() {
        return puntosDeVida;
    }
    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }
    public int getRangoAtaque() {
        return rangoAtaque;
    }
    public void setRangoAtaque(int rangoAtaque) {
        this.rangoAtaque = rangoAtaque;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Facción: " + getNombre() +
                ", Ataque: " + ataque +
                ", Defensa: " + defensa +
                ", Movimiento: " + rangoMovimiento +
                ", Puntos de Vida: " + puntosDeVida +
                ", Rango de Ataque: " + rangoAtaque);
    }
}
