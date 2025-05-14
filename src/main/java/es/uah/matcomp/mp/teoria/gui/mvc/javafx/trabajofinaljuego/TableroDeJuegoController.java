package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableroDeJuegoController implements Initializable {
    @FXML
    private GridPane tableroGrid; // GridPane definido en tablero.fxml
    public void inicializarTablero(int altura, int anchura) {
        // Limpiar tablero previo
        tableroGrid.getChildren().clear();
        tableroGrid.setHgap(5);
        tableroGrid.setVgap(5);
        for (int fila = 0; fila < altura; fila++) {
            for (int col = 0; col < anchura; col++) {
                Button celda = new Button();
                celda.setPrefSize(40, 40);
                celda.setStyle("-fx-background-color: lightgray; -fx-border-color: black;");
                // Acción ejemplo: cambiar color al pulsar
                celda.setOnAction(e -> {
                    celda.setStyle("-fx-background-color: deepskyblue; -fx-border-color: black;");
                });
                tableroGrid.add(celda, col, fila);
            }
        }
    }







    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }









}
