package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.animation.PauseTransition;
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
import javafx.util.Duration;
import javafx.util.converter.NumberStringConverter;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class JuegoController implements Initializable {

    @FXML
    private Label contadores;


    @FXML
    private GridPane tableroGrid;

    public void guardar() {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CargarPartida.class.getResource("Guardar-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Guardar Partida ");
            PauseTransition pausa = new PauseTransition(Duration.seconds(2));
            stage.setScene(scene);
            stage.show();
            pausa.play();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @FXML
    public void detalles(){
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CargarPartida.class.getResource("DetallesDePersonaje-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Detalles Personaje ");

            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setEsquinas() {
        int anch = TableroSize.getAnchura();  // Tomar el valor guardado
        int alt = TableroSize.getAltura();

        for (int fila = 0; fila < alt; fila++) {
            for (int col = 0; col < anch; col++) {


                Personaje unit = Personaje.getPersonajeActivo();
                if (unit != null && unit.getFaccion().equals("Ciencias")) {
                    unit.setUnidades("Mat", "Fis");
                }
                    Button mat = new Button("M");
                    mat.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: blue; -fx-text-fill: white; ");
                    tableroGrid.add(mat, 0, anch-1);
                    Button fis = new Button("F");
                    fis.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: blue; -fx-text-fill: white; ");
                    tableroGrid.add(fis, alt-1, anch-1);

                }
            Personaje unitl = Personaje.getPersonajeActivo();
            if (unitl != null && unitl.getFaccion().equals("Letras")) {
                unitl.setUnidades("Hist", "Fil");
            }
                    Button hist = new Button("H");
                    hist.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: red; -fx-text-fill: white; ");
                    tableroGrid.add(hist, 0, 0);
                    Button fil = new Button("L");
                    fil.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: red; -fx-text-fill: white; ");
                    tableroGrid.add(fil, alt-1, 0);

                }



    }











    public void initialize(URL url, ResourceBundle resourceBundle) {
        int ancho = TableroSize.getAnchura();  // Tomar el valor guardado
        int alto = TableroSize.getAltura();    // Tomar el valor guardado



        System.out.println("Creando tablero de tamaño: " + ancho + "x" + alto);
        contadores.setText("RONDA: 0  TURNO: PLAYER  CIENCIAS: 2  LETRAS: 2");
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
        setEsquinas();


    }

}







