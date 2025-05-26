package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;

import javafx.animation.PauseTransition;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.stage.Modality;



public class JuegoController implements Initializable {

    @FXML
    private Label contadores;
    private Button SALIR;


    @FXML
    private GridPane tableroGrid;
    @FXML
    private VBox menuVBox;

    public void guardar() {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CargarPartida.class.getResource("Guardar-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Guardar Partida ");
            PauseTransition pausa = new PauseTransition(Duration.seconds(2));
            stage.setScene(scene);
            stage.show();
            pausa.play();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @FXML
    public void detalles() {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(CargarPartida.class.getResource("DetallesDePersonaje-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Detalles Personaje ");

            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void setEsquinas() {
        int anch = TableroSize.getAnchura();  // Tomar el valor guardado
        int alt = TableroSize.getAltura();

        for (int fila = 0; fila < alt; fila++) {
            for (int col = 0; col < anch; col++) {


                Personaje unit = Personaje.getPersonajeActivo();
                if (unit != null && unit.getFaccion().equals("Ciencias")) {
                    unit.setUnidades("Mat", "Fis");

                    Button mat = new Button("M");
                    mat.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: blue; -fx-text-fill: white; ");
                    mat.setPrefSize(30, 30);
                    tableroGrid.add(mat, 0, alt - 1);

                    Button fis = new Button("F");
                    fis.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: blue; -fx-text-fill: white; ");
                    fis.setPrefSize(30, 30);
                    tableroGrid.add(fis, anch - 1, alt - 1);

                    Button hist = new Button("H");
                    hist.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: red; -fx-text-fill: white; ");
                    hist.setPrefSize(30, 30);
                    tableroGrid.add(hist, 0, 0);

                    Button fil = new Button("L");
                    fil.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: red; -fx-text-fill: white; ");
                    fil.setPrefSize(30, 30);
                    tableroGrid.add(fil, anch - 1, 0);
                }
                Personaje unitl = Personaje.getPersonajeActivo();
                if (unitl != null && unitl.getFaccion().equals("Letras")) {
                    unitl.setUnidades("Hist", "Fil");

                    Button hist = new Button("H");
                    hist.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: red; -fx-text-fill: white; ");
                    hist.setPrefSize(30, 30);
                    tableroGrid.add(hist, 0, alt - 1);

                    Button fil = new Button("L");
                    fil.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: red; -fx-text-fill: white; ");
                    fil.setPrefSize(30, 30);
                    tableroGrid.add(fil, anch - 1, alt - 1);

                    Button mat = new Button("M");
                    mat.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: blue; -fx-text-fill: white; ");
                    mat.setPrefSize(30, 30);
                    tableroGrid.add(mat, 0, 0);

                    Button fis = new Button("F");
                    fis.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: blue; -fx-text-fill: white; ");
                    fis.setPrefSize(30, 30);
                    tableroGrid.add(fis, anch - 1, 0);
                }


            }

        }

    }

    public void actualizarSizeTablero(int filas, int columnas) {
        int sizeCelda = 35; // Tamaño base de cada celda
        int paddingTotal = 20;// Espacio adicional para padding


        int anchoTablero = sizeCelda * columnas + paddingTotal;
        int altoTablero = sizeCelda * filas + paddingTotal;

        // Ajustar el tamaño dinámicamente
        tableroGrid.setPrefWidth(anchoTablero);
        tableroGrid.setPrefHeight(altoTablero);
        tableroGrid.setMinWidth(anchoTablero);
        tableroGrid.setMinHeight(altoTablero);

        System.out.println("Nuevo tamaño del tablero: " + anchoTablero + "x" + altoTablero);
    }

    @FXML
    public void ajustarMenuLateral(int anchoTablero) {
        int tamBaseMenu = 150;  // Tamaño mínimo de la caja lateral
        double tamMenuAjustado = Math.max(tamBaseMenu, anchoTablero / 2.5);

        menuVBox.setPrefWidth(tamMenuAjustado);
        menuVBox.setMinWidth(tamMenuAjustado);

    }

    @FXML
    public void ajustarBotonesMenu() {
        for (Node node : menuVBox.getChildren()) {
            if (node instanceof VBox) { // Recorremos cada VBox dentro de menuVBox
                for (Node subNode : ((VBox) node).getChildren()) {
                    if (subNode instanceof Button) {
                        ((Button) subNode).setMinWidth(60); // 🔹 Fijamos un tamaño mínimo
                        ((Button) subNode).setPrefWidth(Math.max(80, menuVBox.getPrefWidth() * 0.5));
                    }
                }
            }
        }
    }


    public void initialize(URL url, ResourceBundle resourceBundle) {

        int ancho = TableroSize.getAnchura();  // Tomar el valor guardado
        int alto = TableroSize.getAltura();    // Tomar el valor guardado

        actualizarSizeTablero(TableroSize.getAltura(), TableroSize.getAnchura());
        ajustarMenuLateral((int) tableroGrid.getPrefWidth());
        menuVBox.layout();
        ajustarBotonesMenu();
        for (Node node : menuVBox.getChildren()) {
            if (node instanceof Button) {
                ((Button) node).setPrefWidth(menuVBox.getPrefWidth() * 0.8);
            }
        }

        System.out.println("Creando tablero de tamaño: " + ancho + "x" + alto);
        contadores.setText("RONDA: 0  TURNO: PLAYER  CIENCIAS: 2  LETRAS: 2");
        System.out.println(tableroGrid);
        double cellAncho = Math.max(30, Math.floor((tableroGrid.getPrefWidth() - 20) / ancho));
        double cellAlto = Math.max(30, Math.floor((tableroGrid.getPrefHeight() - 20) / alto));


        tableroGrid.getChildren().clear();
        tableroGrid.setHgap(0);
        tableroGrid.setVgap(0);
        tableroGrid.setPadding(new Insets(10, 10, 10, 10));

        for (int fila = 0; fila < alto; fila++) {
            for (int col = 0; col < ancho; col++) {
                Button celda = new Button();
                celda.setPrefSize(cellAncho, cellAlto);
                celda.setPadding(Insets.EMPTY);
                GridPane.setMargin(celda, Insets.EMPTY);
                celda.setStyle("-fx-border-color: black; -fx-border-width: 1px; -fx-background-color: lightgray;");
                tableroGrid.add(celda, col, fila);


            }

        }
        setEsquinas();
    }

    @FXML
    private void Salir() {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PantallaPrincipal-view.fxml"));
        //para conectar a la venta siguiente necesito el fxml de la ventana siguiente
        try {
            Scene scene = new Scene(fxmlLoader.load(), 500, 500);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("PantallaPrincipal");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final int n = 5;
    private static final int m = 7;
    private Button[][] mapa = new Button[n][m];

    private int fila = 0;
    private int columna = 0;

    private static final String CELL_STYLE = "-fx-border-color: black; -fx-text-alignment: center;";
    private static final String CHAR_STYLE = "-fx-background-color: #4CAF50; -fx-text-fill: white; -fx-border-color: black;";

    @FXML
    private GridPane tableroDeJuego;

    @FXML
    public void initialize() {
        tableroDeJuego.setAlignment(Pos.CENTER);
        tableroDeJuego.setHgap(5);
        tableroDeJuego.setVgap(5);
        inicializarTablero();

        // Manejador de teclado
        tableroDeJuego.setOnKeyPressed(event -> {
            KeyCode code = event.getCode();
            if (code == KeyCode.UP) {
                mover(fila - 1, columna);
            } else if (code == KeyCode.DOWN) {
                mover(fila + 1, columna);
            } else if (code == KeyCode.LEFT) {
                mover(fila, columna - 1);
            } else if (code == KeyCode.RIGHT) {
                mover(fila, columna + 1);
            }
        });

        // Para recibir eventos de teclado
        tableroDeJuego.requestFocus();
    }

    private void inicializarTablero() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Button casilla = new Button("Celda " + i + "," + j);
                casilla.setMinSize(100, 60);
                casilla.setStyle(CELL_STYLE);
                casilla.setFocusTraversable(false);
                mapa[i][j] = casilla;
                tableroDeJuego.add(casilla, j, i);
            }
        }
        cambiarPoscion();
    }

    private void mover(int fila, int columna) {
        if (fila >= 0 && fila < n && columna >= 0 && columna < m) {
            this.fila = fila;
            this.columna = columna;
            cambiarPoscion();
        }
    }

    private void cambiarPoscion() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Button b = mapa[i][j];
                if (i == fila && j == columna) {
                    b.setText("⚔️ Personaje");
                    b.setStyle(CHAR_STYLE);
                } else {
                    b.setText("Celda " + i + "," + j);
                    b.setStyle(CELL_STYLE);
                }
            }
        }
    }
}