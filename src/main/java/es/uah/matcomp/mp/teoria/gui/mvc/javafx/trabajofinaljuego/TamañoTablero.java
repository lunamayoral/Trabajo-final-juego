package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TamañoTablero extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Tamañotablero-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        stage.setTitle("Tamaño del tablero");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
