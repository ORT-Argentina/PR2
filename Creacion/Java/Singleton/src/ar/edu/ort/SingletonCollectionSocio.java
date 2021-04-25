package ar.edu.ort;

import java.util.ArrayList;

public class SingletonCollectionSocio {

    private ArrayList<Socio> socios = new ArrayList<Socio>();

    private static SingletonCollectionSocio instancia;

    private SingletonCollectionSocio(){

    }

    public static SingletonCollectionSocio instancia() {
        if (instancia==null) {
            instancia = new SingletonCollectionSocio();
        }
        return instancia;
    }

    public Socio buscarSocioPorDni(String dni){
    //Logica de Busqueda
        return new Socio(18);
    }
}
