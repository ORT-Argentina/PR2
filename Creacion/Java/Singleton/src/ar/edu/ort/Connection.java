package ar.edu.ort;

public class Connection {

	private static int contador = 0;

	public Connection(String s, String s2) {
		contador++;
	}

	public int getCantidadObjetos(){
		return contador;
	}

	public boolean test(){
		return true;
	}

	public void ejecutarComandoAlaBase(String comando){

	}

}
