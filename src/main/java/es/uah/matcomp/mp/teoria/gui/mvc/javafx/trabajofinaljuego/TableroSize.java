package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

public class TableroSize {
    private static int anchura;
    private static int altura;

    // Método para guardar los valores que el usuario elige
    public static void setDimensiones(int ancho, int alto) {
        anchura = ancho;
        altura = alto;
    }

    // Métodos para recuperar los valores en otras clases
    public static int getAnchura() { return anchura; }
    public static int getAltura() { return altura; }


}

