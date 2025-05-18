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

import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class FaccionesController implements Initializable {


    public void Ciencas(){
        //Conexion a la siguiente ventana: Tamaño tablero
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Tamañotablero-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Personaje personaje = new Personaje();
            personaje.setFaccion("Ciencias");
            Personaje.setPersonajeActivo(personaje);


            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            stage.initModality(Modality.APPLICATION_MODAL);
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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Tamañotablero-view.fxml"));
        try {
            Personaje personaje = new Personaje();
            personaje.setFaccion("Letras");
            Personaje.setPersonajeActivo(personaje);

            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Tamaño del tablero ");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
