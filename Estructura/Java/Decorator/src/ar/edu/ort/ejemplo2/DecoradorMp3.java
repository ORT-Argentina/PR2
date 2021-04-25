package ar.edu.ort.ejemplo2;

public class DecoradorMp3 extends DecoradorAuto {

    private int precioMp3 = 500;

    public DecoradorMp3(Vendible accesorio_o_concreto){
        super(accesorio_o_concreto);
    }

    @Override
    public int getPrecio() {
        return (super.getPrecio() + this.getPrecioDeEsteAccesorio());
    }

    private int getPrecioDeEsteAccesorio(){
        return this.precioMp3;
    }
}
