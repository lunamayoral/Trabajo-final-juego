package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CasillaTTT {
    int x;
    int y;
    Personaje aliado;
    Personaje enemigo;
    CasillaTTT casilla;
    int numAliados;
    int numEnemigos;

    @FXML
    Label casillaocupada;

    CasillaTTT() {
    }

    CasillaTTT(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CasillaTTT getCasilla() {
        return casilla;
    }

    public void setCasilla(CasillaTTT nuevaCasilla) {
        this.casilla = nuevaCasilla;
    }

    public boolean isCasillaOcupada() {
        if (casilla == aliado.inCasilla() || casilla == enemigo.inCasilla()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean enRangoMovimiento() {
        CasillaTTT actualCasilla = new CasillaTTT(x, y);
        CasillaTTT nuevaCasilla = new CasillaTTT(x, y);
        int difx = nuevaCasilla.x - actualCasilla.x;
        int dify = nuevaCasilla.y - actualCasilla.y;
        while (-aliado.rangoMovimiento < difx && difx < aliado.rangoMovimiento && difx != 0) {
            boolean movex = true;
            return movex;
        }
        while (-aliado.rangoMovimiento < dify && dify < aliado.rangoMovimiento && dify != 0) {
            boolean movey = true;
            return movey;
        }
        return false;
    }

    @FXML
    public CasillaTTT movimiento() {
        CasillaTTT actualCasilla = new CasillaTTT(x, y);
        CasillaTTT nuevaCasilla = new CasillaTTT(x, y);
        while (isCasillaOcupada()) {
            casillaocupada.setText("Casilla ocupada. Seleccione otra casilla");
            return actualCasilla;
        }
        while (enRangoMovimiento())

            setCasilla(nuevaCasilla);
        return nuevaCasilla;
    }
}