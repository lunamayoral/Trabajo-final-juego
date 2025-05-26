package MotorDeJuego;

public abstract class Facciones {
    private String nombre;

    public Facciones(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public abstract void mostrarInfo();
}
