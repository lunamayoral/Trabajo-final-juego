package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableroDeJuegoController implements Initializable {
    @FXML
    private GridPane tableroGrid;
    @FXML
    private Label titulo;
    @FXML
    private Label opciones;

    public void inicializarTablero(int altura, int anchura) {
        tableroGrid.getChildren().clear();
        tableroGrid.setHgap(0);
        tableroGrid.setVgap(0);
        tableroGrid.setPadding(Insets.EMPTY);

        for (int fila = 0; fila < altura; fila++) {
            for (int col = 0; col < anchura; col++) {
                Button celda = new Button();
                celda.setPrefSize(tableroGrid.getPrefWidth()/anchura, tableroGrid.getPrefHeight()/altura);
                celda.setPadding(Insets.EMPTY);
                GridPane.setMargin(celda, Insets.EMPTY);
                celda.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: lightgray;");

                tableroGrid.add(celda, col, fila);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {    }



}
