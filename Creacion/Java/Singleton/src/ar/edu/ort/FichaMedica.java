package ar.edu.ort;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FichaMedica {

    private ArrayList<Apto> aptos = new ArrayList<Apto>();

    public FichaMedica(){
        aptos.add(new Apto());
    }

    public Apto obtenerUltimoApto(){
        return aptos.get(0);
    }
}
