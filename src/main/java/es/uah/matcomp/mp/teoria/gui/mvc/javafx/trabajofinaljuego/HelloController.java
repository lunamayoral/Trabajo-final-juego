package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    private Label nuevapartida;
    private Label cargarpartida;

    @FXML
    private void nuevapartidaButtonClick() {
        nuevapartida.setText("Nueva partida");
    }

    @FXML
    private void cargarpartidaButtonClick() {
        cargarpartida.setText("Cargar partida");
    }

}