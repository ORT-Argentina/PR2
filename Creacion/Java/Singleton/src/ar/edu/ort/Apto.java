package ar.edu.ort;

public class Apto {

    private Boolean vencido;

    public Apto(){
        this.vencido = false;
    }

    public Boolean ValidarVencimiento(){
        return vencido;
    }
}
