package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class TamañoTableroController implements Initializable {
    @FXML
    private Label seleccionarTamaño;
    @FXML
    private Label altura;
    @FXML
    private Label anchura;

    private Label generarTablero;
    @FXML
    private void generarTableroButtonClick() {
        generarTablero.setText("Generar Tablero");
    }

    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
