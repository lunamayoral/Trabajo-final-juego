package MotorDeJuego;

public class Fisico extends Ciencias {
    public Fisico() {
        super("Ciencias", 200, 230, 300, 150,200);
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Personaje: Físico, ");
        super.mostrarInfo();
    }
}
