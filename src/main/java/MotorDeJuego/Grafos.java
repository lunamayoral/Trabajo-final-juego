package MotorDeJuego;

public class Grafos {
    private int vertices;
    private double[][] Matriz;

    public Grafos(int nVertices) {
        vertices = nVertices;
        Matriz = new double[vertices][vertices];
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (i == j) {
                    Matriz[i][j] = 0;
                } else {
                    Matriz[i][j] = Double.POSITIVE_INFINITY;
                }
            }
        }
    }

    public void addArista(int desde, int hasta, double peso) {
        if (desde < 0 || desde >= vertices || hasta < 0 || hasta >= vertices) {
            throw new IllegalArgumentException("Índice de vértice fuera de rango");
        }
        Matriz[desde][hasta] = peso;
        Matriz[hasta][desde] = peso;
    }

    // Algoritmo de Dijkstra
    public DijkstraResult dijkstra(int inicio) {
        double[] distancias = new double[vertices];
        int[] anterior = new int[vertices];
        boolean[] vistos = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            distancias[i] = Double.POSITIVE_INFINITY;
            anterior[i] = -1;
            vistos[i] = false;
        }
        distancias[inicio] = 0;

        for (int i = 0; i < vertices; i++) {
            int minimo = minDist(distancias, vistos);
            if (minimo != -1) {
                vistos[minimo] = true;
                for (int j = 0; j < vertices; j++) {
                    if (!vistos[j] && Matriz[minimo][j] != Double.POSITIVE_INFINITY) {
                        double temporal = distancias[minimo] + Matriz[minimo][j];
                        if (temporal < distancias[j]) { // Se encuentra una ruta mejor
                            distancias[j] = temporal;
                            anterior[j] = minimo;
                        }
                    }
                }
            }
        }
        return new DijkstraResult(distancias, anterior);
    }

    private int minDist(double[] distancias, boolean[] vistos) {
        double min = Double.POSITIVE_INFINITY;
        int indiceMenor = -1;
        for (int i = 0; i < vertices; i++) {
            if (!vistos[i] && distancias[i] < min) {
                min = distancias[i];
                indiceMenor = i;
            }
        }
        return indiceMenor;
    }

    public int[] getCaminoMasCorto(int inicio, int fin) {
        DijkstraResult resultado = dijkstra(inicio);

        int[] caminoInverso = new int[vertices];
        int count = 0;
        int actual = fin;
        while (actual != -1) {
            caminoInverso[count++] = actual;
            actual = resultado.previous[actual];
        }

        if (caminoInverso[count - 1] != inicio) {
            return new int[0];
        }

        // Invertir para obtener el camino correcto
        int[] camino = new int[count];
        for (int i = 0; i < count; i++) {
            camino[i] = caminoInverso[count - 1 - i];
        }
        return camino;
    }

    public static class DijkstraResult {
        public final double[] distances;
        public final int[] previous;

        public DijkstraResult(double[] distances, int[] previous) {
            this.distances = distances;
            this.previous = previous;
        }
    }

    // Ejemplo de uso básico
    public static void main(String[] args) {
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
}