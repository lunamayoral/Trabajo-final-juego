package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class PantallaPrincipalController implements Initializable {

    @FXML
    public void Instrucciones() {
        //Conexion a la siguiente ventana: instrucciones
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Instrucciones-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Instrucciones");
            LogSetup.log("PLAYER escogió leer las instrucciones");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void IniciarJuego() {
        //Conexion a la siguiente ventana: iniciar juego
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SegundaPantalla-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Iniciar Juego");
            stage.setScene(scene);
            LogSetup.log("PLAYER escogió INICIAR el JUEGO");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}


