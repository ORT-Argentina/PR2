package ar.edu.ort.ejemplo2;

public class AutosComplejo {

    int precio = 0;
    boolean conAlarma = false;
    boolean conLlantas = false;
    boolean conMp3 = false;
    boolean conCalcos = false;

    public AutosComplejo(){
    }

    public int getPrecio(){
        int precioBase = this.precio;

        if( this.conAlarma )
            precioBase += 100;

        if( this.conAlarma )
            precioBase += 50;

        if( this.conMp3)
            precio += 30;

        if( this.conCalcos )
            precio += 5;

        return precioBase;
    }

    public boolean getAlarma(){
        return this.conAlarma;
    }

    public boolean getLlantas(){
        return this.conLlantas;
    }

    public boolean getMp3(){
        return this.conMp3;
    }
}
