package ar.edu.ort.ejemplo2;

public abstract class DecoradorAuto implements Vendible {

    private Vendible accesorio;
    private int precio;
    private String descripcion;

    @Override
    public int getPrecio() {
        return accesorio.getPrecio();
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    public DecoradorAuto(Vendible accesorio_o_concreto){
        this.accesorio = accesorio_o_concreto;
    }

}
