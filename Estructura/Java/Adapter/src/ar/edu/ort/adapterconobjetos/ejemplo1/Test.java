package ar.edu.ort.adapterconobjetos.ejemplo1;

public class Test {
	
	public static void main(String[] args) {
		//Creo un barco pesquero
		BarcoPesquero barcoPesquero = new BarcoPesquero();
		
		//Creo un adaptador para todo tipo de barcos a motor (el pesquero es uno de ellos)
		//Le paso por parámetro el barco recién creado, que implementa la interfaz
		//BarcoAMotor, por lo que va a ser admitido por el Adapter
		AdapterBarcoAMotor adapterBarcoAMotor = new AdapterBarcoAMotor(barcoPesquero);
		
		//Creo al capitan y le paso el adapter recien creado, que va a ser admitido por el
		//capitan porque implementa la interfaz BarcoAVela
		Capitan capitan = new Capitan(adapterBarcoAMotor);
		
		//El capitan puede usar la misma interfaz para navegar el barco a motor, a pesar de que 
		//su interfaz solo le permite navegar a vela
		//Podemos pensar en esto como una especie de dispositivo "traductor" que le permite al
		//capitan navegar con sus conocimientos de vela, un barco a motor
	    capitan.navegarAVela();
	}
}