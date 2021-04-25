package ar.edu.ort;

public class SingletonCartelera {

    private String cartelera = "";

    private static SingletonCartelera instancia;

    private SingletonCartelera(){

    }

    public static SingletonCartelera instancia() {
        if (instancia==null) {
            instancia = new SingletonCartelera();
        }
        return instancia;
    }

    public void setCartelera( String Mensaje){
        this.cartelera = Mensaje;
    }

    public String getCartelera(){
        return cartelera;
    }
}
