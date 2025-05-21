package MotorDeJuego;

public class Filologo extends Letras {
    public Filologo() {
        super("Letras", 200, 60, 160, 90,450);
    }
    @Override
    public void mostrarInfo() {
        System.out.print("Personaje: Filólogo, ");
        super.mostrarInfo();
    }
}
