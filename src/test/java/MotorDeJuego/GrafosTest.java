package MotorDeJuego;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrafosTest {

    @Test
    void addArista() {
        Grafos grafo = new Grafos(5);
        grafo.addArista(0, 1, 10);
    }

    @Test
    void getCaminoMasCorto() {
        Grafos grafo = new Grafos(5);
        grafo.addArista(0, 1, 10);
        grafo.addArista(0, 3, 5);
        grafo.addArista(1, 2, 1);
        grafo.addArista(1, 3, 2);
        grafo.addArista(2, 4, 4);
        grafo.addArista(3, 1, 3);
        grafo.addArista(3, 2, 9);
        grafo.addArista(3, 4, 2);
        grafo.addArista(4, 0, 8);
        grafo.addArista(4, 2, 6);

        int[] camino = grafo.getCaminoMasCorto(0, 4);

        System.out.print("Camino más corto de inicio a fin: ");
        for (int vertice : camino) {
            System.out.print(vertice + " ");
        }
        System.out.println();
    }

    @Test
    void main() {
        Grafos.main(null);
    }
}