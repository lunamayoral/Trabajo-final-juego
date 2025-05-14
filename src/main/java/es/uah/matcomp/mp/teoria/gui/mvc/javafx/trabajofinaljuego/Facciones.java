package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Facciones extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("facciones-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 380, 360);
        stage.setTitle("Facciones");

        GridPane grid = new GridPane();
        for (int i = 0; i<2; i++) {
            for (int j = 0; j < 1; j++) {

                if (i == 0) {
                    Button ciencias = new Button("CIENCIAS");
                    ciencias.setMinSize(50, 50); // Tamaño mínimo para visualización
                    ciencias.setStyle("-fx-border-color: black; -fx-background-color: blue; -fx-text-alignment: center;");
                    grid.add(ciencias, i, j);
                }
                if (i == 1) {
                    Button letras = new Button("LETRAS");
                    letras.setMinSize(50, 50); // Tamaño mínimo para visualización
                    letras.setStyle("-fx-border-color: black; -fx-background-color: red; -fx-text-alignment: center;");
                    grid.add(letras, i, j);

                }


            }
        }


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
