package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarController {
    @FXML
    private TextField partida;

    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void onGuardarButtonClick(){
        String contrasenna = partida.getText();
        guardarObjetoEnArchivo(contrasenna + ".json", "info");//Aqui tenemos que meter toda la informacion de la partida
    }
}
