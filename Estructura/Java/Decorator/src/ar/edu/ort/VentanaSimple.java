package ar.edu.ort;

//Clase componente concreto
public class VentanaSimple implements ComponenteVisual {

	public VentanaSimple(){
		System.out.println("Constructor");
	}

	 public void dibujar() {
	    	System.out.println("dibujo una ventana");
	 }
	 
	public String getDescripcion() {
	    return "ventana simple";
	}
}