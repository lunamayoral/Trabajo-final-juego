module es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.google.gson;
    requires java.desktop;
    requires java.logging;

    opens es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego to javafx.fxml;
    exports es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;
    exports MotorDeJuego;
    opens MotorDeJuego to javafx.fxml;
}