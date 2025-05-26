package es.uah.matcomp.mp.teoria.gui.mvc.javafx.trabajofinaljuego;


public class Personaje {
    Personaje personaje;
     String nombre;
    int puntosDeVida;
    int rangoMovimiento;
    int rangoAtaque;
    int ataque;
    int defensa;
    CasillaTTT casilla;
    String faccion;
    String M;
    String Fis;
    String H;
    String Fil;

    private static Personaje personajeActivo;

    Personaje(){}
    Personaje(int rangoMovimiento, int ataque, int defensa){
        this.rangoMovimiento = rangoMovimiento;
        this.ataque= ataque;
        this.defensa = defensa;

    }


    public Personaje(String nombre, int puntosDeVida, int rangoMovimiento, int rangoAtaque, int ataque, int defensa){
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.rangoMovimiento = rangoMovimiento;
        this.rangoAtaque = rangoAtaque;
        this.ataque= ataque;
        this.defensa = defensa;


    }
    public void setFaccion(String faccion){
        if (faccion.equals("Ciencias")){
            this.faccion = faccion;
        }
        if (faccion.equals("Letras")){
            this.faccion = faccion;
        }

    }

    public String getFaccion(){
        return faccion;
    }


    public boolean setUnidades( String unidad1, String unidad2){
        if(getFaccion().equals("Ciencias")){
            M= unidad1;
            Fis = unidad2;
            return true;
        }if (getFaccion().equals("Letras")){
            H= unidad1;
            Fil = unidad2;
            return true;
        } else{
            return false;
        }
    }



    public static void setPersonajeActivo(Personaje personaje) {
        personajeActivo = personaje;
    }

    public static Personaje getPersonajeActivo() {
        return personajeActivo;
    }







    public  void setPersonaje(int movimiento, int ataque, int defensa){
        this.rangoMovimiento = movimiento;
        this.ataque= ataque;
        this.defensa = defensa;

    }



    public String getNombre(){return nombre;}
    public int getPuntosDeVida(){return puntosDeVida;}

    public int getRangoMovimiento(){return rangoMovimiento;}
    public int getRangoAtaque(){return rangoAtaque;}
    public int getAtaque(){return ataque;}
    public int getDefensa(){return defensa;}

    public CasillaTTT inCasilla(){return casilla;}

}
