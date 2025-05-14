package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

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
    @FXML
    private Slider movimiento;
    @FXML
    private Slider ataque;
    @FXML
    private Slider defensa;
    @FXML
    private Label movimientoLabel;
    @FXML
    private Label ataqueLabel;
    @FXML
    private Label defensaLabel;


    @FXML
    private void IniciarJuego() {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CargarPartida.class.getResource("cargandopartida-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Cargando Partida ");
            PauseTransition pausa = new PauseTransition(Duration.seconds(2));
            pausa.setOnFinished(event -> mostrarTableroDeJuego(stage));

            stage.setScene(scene);
            stage.show();


            pausa.play();

        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    public void mostrarTableroDeJuego(Stage stage) {
        stage.close(); // Cerramos la segunda ventana antes de abrir la tercera

        try {
            FXMLLoader loader = new FXMLLoader(TableroDeJuego.class.getResource("tablerodejuego-view.fxml"));
            Scene scene = new Scene(loader.load(), 600, 400);



            Stage stage2 = new Stage();
            stage2.setTitle("Tablero de Juego");
            stage2.setScene(scene);
            stage2.show();


            stage.close(); // Cerrar la ventana anterior
        } catch (IOException e) {
            e.printStackTrace();

        }

    }




    public  void inicializarTablero(int altura, int anchura) {
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
