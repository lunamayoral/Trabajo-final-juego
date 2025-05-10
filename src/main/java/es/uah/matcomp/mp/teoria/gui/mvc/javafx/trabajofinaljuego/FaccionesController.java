package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Button;

import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class FaccionesController implements Initializable {
    Label title;
    Button ciencias;
    Button letras;
    public void Ciencas(){
        //Conexion a la siguiente ventana: Tamaño tablero
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("facciones-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Tamaño del tablero ");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void Letras(){
        //Conexion a la siguiente ventana: Tamaño tablero
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cargarpartida-view.fxml"));
        try {
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.setTitle("Tamaño del tablero ");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //@Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}
