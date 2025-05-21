package MotorDeJuego;

public class Historiador extends Letras {
    public Historiador() {
        super("Letras", 100, 240, 300, 150,700);
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Personaje: Historiador, ");
        super.mostrarInfo();
    }
}
