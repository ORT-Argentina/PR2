package ar.edu.ort;

public class SingletonFacadeControlGym {

    private Socio socio;

    private static SingletonFacadeControlGym instancia;


    private SingletonFacadeControlGym(){
    }

    public static SingletonFacadeControlGym instancia(Socio socio) {
        if (instancia==null) {
            instancia = new SingletonFacadeControlGym(socio);
        }
        return instancia;
    }

    public void setSocio(){
        
    }

    public boolean VerificarEntrada(){

        //SingletonCollectionSocio listaSocios = SingletonCollectionSocio.instancia();

        Socio encontro = this.socio;

        FichaMedica fichaMedia = encontro.getFichaMedica();

        Apto ultimoAptoCargado = fichaMedia.obtenerUltimoApto();

        return ultimoAptoCargado.ValidarVencimiento() && encontro.validarPermiso();
    }
}
