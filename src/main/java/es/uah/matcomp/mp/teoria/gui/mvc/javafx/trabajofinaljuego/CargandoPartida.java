package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;



import java.io.IOException;

public class CargandoPartida extends Application {
    @Override
    public void start(Stage stage1) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cargandopartida-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage1.setTitle("CargandoPartida");

        stage1.setScene(scene);
        stage1.show();


    }


    public static void main(String[] args) {
        launch();
    }
}
