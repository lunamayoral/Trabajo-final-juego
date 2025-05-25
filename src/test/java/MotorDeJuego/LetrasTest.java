package MotorDeJuego;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetrasTest {

    @Test
    void getAtaque() {
        Historiador h = new Historiador();
        assertEquals(100, h.getAtaque());
    }

    @Test
    void setAtaque() {
        Historiador h = new Historiador();
        h.setAtaque(105);
        assertEquals(105, h.getAtaque());
    }

    @Test
    void getDefensa() {
        Historiador h = new Historiador();
        assertEquals(240, h.getDefensa());
    }

    @Test
    void setDefensa() {
        Historiador h = new Historiador();
        h.setDefensa(25);
        assertEquals(25, h.getDefensa());
    }

    @Test
    void getRangoMovimiento() {
        Historiador h = new Historiador();
        assertEquals(300, h.getRangoMovimiento());
    }

    @Test
    void setRangoMovimiento() {
        Historiador h = new Historiador();
        h.setRangoMovimiento(250);
        assertEquals(250, h.getRangoMovimiento());
    }

    @Test
    void getPuntosDeVida() {
        Historiador h = new Historiador();
        assertEquals(150, h.getPuntosDeVida());
    }

    @Test
    void setPuntosDeVida() {
        Historiador h = new Historiador();
        h.setPuntosDeVida(250);
        assertEquals(250, h.getPuntosDeVida());
    }

    @Test
    void getRangoAtaque() {
        Historiador h = new Historiador();
        assertEquals(700, h.getRangoAtaque());
    }

    @Test
    void setRangoAtaque() {
        Historiador h = new Historiador();
        h.setRangoAtaque(750);
        assertEquals(750, h.getRangoAtaque());
    }

    @Test
    void mostrarInfo() {
    }
}