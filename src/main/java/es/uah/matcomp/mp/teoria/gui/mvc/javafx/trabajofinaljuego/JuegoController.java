package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class JuegoController implements Initializable {


    @FXML
    private GridPane tableroGrid;


    public void initialize(URL url, ResourceBundle resourceBundle) {
        int ancho = TableroSize.getAnchura();  // Tomar el valor guardado
        int alto = TableroSize.getAltura();    // Tomar el valor guardado

        System.out.println("Creando tablero de tamaño: " + ancho + "x" + alto);
        System.out.println(tableroGrid);

        tableroGrid.getChildren().clear();
        tableroGrid.setHgap(0);
        tableroGrid.setVgap(0);
        tableroGrid.setPadding(new Insets(10, 10, 10, 10));

        for (int fila = 0; fila < alto; fila++) {
            for (int col = 0; col < ancho; col++) {
                Button celda = new Button();
                celda.setPrefSize((tableroGrid.getPrefWidth()-20)/ancho, (tableroGrid.getPrefHeight()-20)/alto);
                celda.setPadding( Insets.EMPTY);
                GridPane.setMargin(celda, Insets.EMPTY);
                celda.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: lightgray;");

                tableroGrid.add(celda, col, fila);
            }
        }
    }
}







