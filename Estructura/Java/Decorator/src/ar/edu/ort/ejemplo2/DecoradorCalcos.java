package ar.edu.ort.ejemplo2;

public class DecoradorCalcos extends DecoradorAuto {

    private int precioCalco = 50;

    public DecoradorCalcos(Vendible accesorio_o_concreto){
        super(accesorio_o_concreto);
    }

    @Override
    public int getPrecio() {
        return (super.getPrecio() + this.getPrecioDeEsteAccesorio());
    }

    private int getPrecioDeEsteAccesorio(){
        return this.precioCalco;
    }
}
