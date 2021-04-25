package ar.edu.ort;

import java.util.ArrayList;

public class SingletonMolinete {

    private static int contador = 0;
    private static int maximo = 2;
    private static ArrayList<SingletonMolinete> instancia = new ArrayList<SingletonMolinete>();


    private SingletonMolinete() {
    }

    public static SingletonMolinete instancia() {
        //Lazy loading, se crea cuando es llamado por primera vez
        if (instancia==null || maximo > contador) {
            instancia.add(new SingletonMolinete());
            contador++;
        }
        return instancia.get(contador-1);
    }

    public boolean controlIngreso(){
        return true;
    }
}
