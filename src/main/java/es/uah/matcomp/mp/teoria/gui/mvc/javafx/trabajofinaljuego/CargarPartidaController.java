package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;
import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CargarPartidaController implements Initializable{

    @FXML
    public void Continuar(){
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CargarPartida.class.getResource("cargandopartida-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Cargando Partida ");
            PauseTransition pausa = new PauseTransition(Duration.seconds(2));
            pausa.setOnFinished(event -> mostrarTableroDeJuego(stage));
            stage.setScene(scene);
            LogSetup.log("Accediendo a partida anterior");
            stage.show();
            pausa.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mostrarTableroDeJuego(Stage stage) {
        stage.close(); // Cerramos la segunda ventana antes de abrir la tercera

        try {
            FXMLLoader loader = new FXMLLoader(TableroDeJuego.class.getResource("Juego-view.fxml"));
            Scene scene = new Scene(loader.load(), 600, 600);
            Stage stage2 = new Stage();
            stage2.setTitle("Tablero de Juego");
            stage2.setScene(scene);
            stage2.show();
            stage.close(); // Cerrar la ventana anterior
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void setStage(Stage stage) {
    }
}
