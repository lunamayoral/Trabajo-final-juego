package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DetallesDePersonajeController implements Initializable {
    @FXML
    private Label detalles;
    private Label puntos;
    private Label ataque;
    private Label defensa;
    private Label rangodemovimiento;
    private Label rangodeataque;

    @FXML
    protected void puntosButtonClick(){
        puntos.setText("Puntos de Vida: ");
    }

    @FXML
    protected void ataqueButtonClick(){
        ataque.setText("Ataque: ");
    }

    @FXML
    protected void defensaButtonClick(){
        defensa.setText("Defensa: ");
    }

    @FXML
    protected void rangodemovimientoButtonClick(){
        rangodemovimiento.setText("Rango de movimiento: ");
    }

    @FXML
    protected void rangodeataqueButtonClick(){
        rangodeataque.setText("Rango de ataque: ");
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    /***
    private Personaje personaje;

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (personaje != null) {
            detalles.setText(personaje.getNombre());
            puntos.setText("Puntos: " + personaje.getPuntos());
            ataque.setText("Ataque: " + personaje.getAtaque());
            defensa.setText("Defensa: " + personaje.getDefensa());
            rangodemovimiento.setText("Rango de Movimiento: " + personaje.getRangoMovimiento());
            rangodeataque.setText("Rango de Ataque: " + personaje.getRangoAtaque());
        }
    }
    ***/
}
