package ar.edu.ort;

public class Test2 {

    public static void main(String[] args) {

        CaminoOptimo estrategia =  new EstrategiaPie();

        ApplicacionMapa mapaGoogle =new ApplicacionMapa(1, 2);

        mapaGoogle.setEstrategia(estrategia);
        mapaGoogle.buscarCamino(1,2);

    }
}
