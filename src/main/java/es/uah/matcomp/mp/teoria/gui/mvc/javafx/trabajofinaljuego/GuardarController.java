package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class GuardarController {
    @FXML
    private PasswordField Id;

    @FXML
    private Label Partida;

    @FXML
    protected void onAcceptBttClick(){
        Partida.setText("Su código de partida es: "+Id.getText()+", asegúrese de no perderlo");
    }
}
