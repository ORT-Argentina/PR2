package ar.edu.ort.ejemplo2;

enum ModeloAuto{
    SPIN,
    AGILE,
    TRACKER
}

public class AutoSimple implements Vendible {

    private Modelo modelo; //Spin o Agile o Tracker
    private int precio_base;

    public AutoSimple( ModeloAuto enumerador){
        return modelo.getPrecio();
/*
        switch(this.modelo){
            case AGILE:
                this.precio_base = 100000;
                break;
            case SPIN:
                this.precio_base = 120000;
                break;
            case TRACKER:
                this.precio_base = 150000;
                break;
        }*/
    }

    @Override
    public int getPrecio() {
        return this.precio_base;
    }

    @Override
    public String getDescripcion() {
        return null;
    }
}
