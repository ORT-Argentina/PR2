package ar.edu.ort.ejemplo2;

import ar.edu.ort.*;

public class Prueba {

    public static void main(String[] args)
    {
        AutoSimple spinBase = new AutoSimple(ModeloAuto.AGILE);

        spinBase.getPrecio();

        System.out.print("Auto sin accesorios");
        System.out.print(spinBase.getPrecio());
        System.out.println();

        Vendible accesorios_con_auto = new DecoradorCalcos(new DecoradorMp3(spinBase));
        System.out.print("Auto con Mp3 y Calcos");
        System.out.print( accesorios_con_auto.getPrecio() );
        System.out.println();

    }
}
