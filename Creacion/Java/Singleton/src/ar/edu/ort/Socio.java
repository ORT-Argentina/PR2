package ar.edu.ort;

public class Socio {

    private int edad;
    private Boolean tienePermiso = true;


    private FichaMedica fichaMedica;

    public Socio( Integer Edad ){
        this.edad = Edad;
        if( this.edad < 18 )
            this.tienePermiso = false;
    }

    public FichaMedica getFichaMedica(){
        return this.fichaMedica;
    }

    public boolean validarPermiso(){
        return tienePermiso;
    }
}
