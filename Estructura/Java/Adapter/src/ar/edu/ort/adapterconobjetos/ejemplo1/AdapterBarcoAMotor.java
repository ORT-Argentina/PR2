package ar.edu.ort.adapterconobjetos.ejemplo1;

//Clase Adaptador
public class AdapterBarcoAMotor implements BarcoAVela {

	private BarcoAMotor barcoAMotor;
	
	public AdapterBarcoAMotor(BarcoAMotor boat) {
		this.barcoAMotor = boat;
	}

	@Override
	public void navegarAVela() {
		barcoAMotor.navegar();
	}
}