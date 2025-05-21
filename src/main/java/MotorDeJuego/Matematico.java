package MotorDeJuego;

public class Matematico extends Ciencias {
    public Matematico() {
        super("Ciencias", 100, 250, 300, 150,600);
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Personaje: Matemático, ");
        super.mostrarInfo();
    }

}
