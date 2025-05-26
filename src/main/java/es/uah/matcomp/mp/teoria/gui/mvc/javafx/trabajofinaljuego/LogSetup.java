package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import java.util.logging.*;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class LogSetup {
    private static final Logger LOGGER = Logger.getLogger(LogSetup.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("game_logs.txt", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (Exception e) {
            LOGGER.warning("No se pudo crear el archivo de logs.");
        }
    }

    public static void log(String message) {
        LOGGER.info(message);
    }
}
