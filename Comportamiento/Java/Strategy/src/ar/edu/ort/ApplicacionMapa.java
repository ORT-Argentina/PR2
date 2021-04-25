package ar.edu.ort;

import java.rmi.UnexpectedException;

public class ApplicacionMapa {
    private Mapa _mapa;
    private int _cordenadaInico;
    private String _tipoMapa;
    private int Origne;
    private int Destino;
    private CaminoOptimo _estrategia;

    public ApplicacionMapa(int coordenada, String tipoMapa){
        this._cordenadaInico = coordenada;
        this._tipoMapa = tipoMapa;
    }

    public void setEstrategia( CaminoOptimo estrategia ){
        this._estrategia = estrategia;
    }

    public void buscarCamino(int origen, int destino){

        if(this._estrategia == null)
            throw new UnexpectedException("Estrategia no setead");

        Mapa resultado = this._estrategia.buscarCamino(this);

        _mapa.dibujarRuta(resutlado);
    }
}
