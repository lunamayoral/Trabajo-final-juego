package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import java.io.IOException;

public class CargandoPartida extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cargandopartida-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("CargandoPartida");




    }

    public static void main(String[] args) {
        launch();
    }
}
