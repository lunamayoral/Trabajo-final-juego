package MotorDeJuego;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CienciasTest {
    @Test
    void getAtaque() {
        Matematico matematico = new Matematico();
        assertEquals(matematico.getAtaque(), 100);
    }

    @Test
    void setAtaque() {
        Matematico matematico = new Matematico();
        matematico.setAtaque(200);
        assertEquals(matematico.getAtaque(), 200);
    }

    @Test
    void getDefensa() {
        Matematico matematico = new Matematico();
        assertEquals(matematico.getDefensa(), 250);
    }

    @Test
    void setDefensa() {
        Matematico matematico = new Matematico();
        matematico.setDefensa(200);
        assertEquals(matematico.getDefensa(), 200);
    }

    @Test
    void getRangoMovimiento() {
        Matematico matematico = new Matematico();
        assertEquals(matematico.getRangoMovimiento(), 300);
    }

    @Test
    void setRangoMovimiento() {
        Matematico matematico = new Matematico();
        matematico.setRangoMovimiento(200);
        assertEquals(matematico.getRangoMovimiento(), 200);
    }

    @Test
    void getPuntosDeVida() {
        Matematico matematico = new Matematico();
        assertEquals(matematico.getPuntosDeVida(), 150);
    }

    @Test
    void setPuntosDeVida() {
        Matematico matematico = new Matematico();
        matematico.setPuntosDeVida(200);
        assertEquals(matematico.getPuntosDeVida(), 200);
    }

    @Test
    void getRangoAtaque() {
        Matematico matematico = new Matematico();
        assertEquals(matematico.getRangoAtaque(), 600);
    }

    @Test
    void setRangoAtaque() {
        Matematico matematico = new Matematico();
        matematico.setRangoAtaque(200);
        assertEquals(matematico.getRangoAtaque(), 200);
    }

    @Test
    void mostrarInfo() {


    }
}