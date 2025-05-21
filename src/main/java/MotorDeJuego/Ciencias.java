package MotorDeJuego;

public class Ciencias extends Facciones{
    protected int ataque;
    protected int defensa;
    protected int rangoMovimiento;
    protected int puntosDeVida;
    protected int rangoAtaque;

    public Ciencias(String nombre, int ataque, int defensa, int rangoMovimiento, int puntosDeVida, int rangoAtaque) {
        super(nombre);
        this.ataque = ataque;
        this.defensa = defensa;
        this.rangoMovimiento = rangoMovimiento;
        this.puntosDeVida = puntosDeVida;
        this.rangoAtaque = rangoAtaque;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Facción: " + getNombre() +
                ", Ataque: " + ataque +
                ", Defensa: " + defensa +
                ", Movimiento: " + rangoMovimiento +
                ", Puntos de Vida: " + puntosDeVida +
                ", Rango de Ataque: " + rangoAtaque);
    }
}
