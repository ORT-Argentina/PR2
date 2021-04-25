package ar.edu.ort.adapterconobjetos.ejemplo1;

public class BarcoPesquero implements BarcoAMotor{

	@Override
	public void navegar() {
		System.out.println("El barco pesquero esta navegando");
	}
}