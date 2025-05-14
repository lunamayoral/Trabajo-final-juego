package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    private Label nuevapartida;
    private Label cargarpartida;

    @FXML
    private void NuevaPartida() {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("facciones-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            stage.setTitle("Facciones");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void CargarPartida() {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cargarpartida-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            stage.setTitle("Cargar partida");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}