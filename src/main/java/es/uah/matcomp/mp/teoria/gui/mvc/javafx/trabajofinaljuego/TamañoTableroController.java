package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.util.converter.NumberStringConverter;

public class TamañoTableroController implements Initializable {
    @FXML
    private Label seleccionarTamaño;
    @FXML
    private Label altura;
    @FXML
    private Label anchura;
    @FXML
    private GridPane tableroDeJuego;
    @FXML
    private  TextField alturaField;  // Para que el jugador ponga la altura (filas)
    @FXML
    private TextField anchuraField; // Para que el jugador ponga la anchura (columnas)

    @FXML
    private void GenerarTablero() {
        String alturaText = alturaField.getText();
        String anchuraText = anchuraField.getText();
        try {
            int altura = Integer.parseInt(alturaText);
            int anchura = Integer.parseInt(anchuraText);
            if (altura <= 0 || anchura <= 0) {
                System.out.println("Introduce valores positivos para altura y anchura.");
                return;
            }


            TableroSize.setDimensiones(anchura, altura);

            System.out.println("Dimensiones guardadas: " + TableroSize.getAnchura() + " x " + TableroSize.getAltura());


            // Cargar la nueva pantalla con el tablero
            FXMLLoader loader = new FXMLLoader(getClass().getResource("tablerodejuego-view.fxml"));
            Parent root = loader.load();

            TableroDeJuegoController contralado = loader.getController();
            contralado.inicializarTablero(TableroSize.getAltura(), TableroSize.getAnchura());
            Stage stage =(Stage) alturaField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Tablero " + altura + " x " + anchura);
            stage.show();




        } catch (NumberFormatException e) {
            System.out.println("Introduce números válidos en altura y anchura.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }















    public void initialize(URL url, ResourceBundle resourceBundle) {



    }
}
