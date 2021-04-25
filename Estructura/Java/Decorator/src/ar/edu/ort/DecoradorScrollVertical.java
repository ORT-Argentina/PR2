package ar.edu.ort;

//Clase decorador concreto
public class DecoradorScrollVertical extends DecoradorVentana {
	
    public DecoradorScrollVertical (ComponenteVisual ventanaDecorada) {
        super(ventanaDecorada);
    }
 
    public void dibujar() {
        dibujarScrollVertical();
        super.dibujar();


    }

    private void dibujarScrollVertical() {
    	System.out.println("decoro con un scroll vertical");
    }
 
    public String getDescripcion() {
        return super.getDescripcion() + ", incluyendo scroll vertical";
    }
}