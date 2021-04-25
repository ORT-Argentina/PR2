package ar.edu.ort;


import java.io.Console;

public class Test {
	
	public static void main(String[] args) {
		/*Test test = new Test();
		test.inicializarConexion("Persona", "persona.cleardb.com");
		test.abrirConexion();
		test.insertar();

		SingletonMolinete molinete1 = SingletonMolinete.instancia();
		SingletonMolinete molinete2 = SingletonMolinete.instancia();
		SingletonMolinete molinete3 = SingletonMolinete.instancia();*/

		/*SingletonCartelera carteleraPrincipal = SingletonCartelera.instancia();

		carteleraPrincipal.setCartelera("Mensaje");


		carteleraPrincipal.setCartelera("Mensaje 2");*/

		Socio menor = new Socio(16);
		Socio mayor = new Socio(21);

		SingletonFacadeControlGym controGym = SingletonFacadeControlGym.instancia(menor);

		System.out.println("Verifico entrada para Socio MEnor");
		//System.out.println(controGym.VerificarEntrada());

		controGym = SingletonFacadeControlGym.instancia(mayor);
		System.out.println("Verifico entrada para Socio MAyor");
		/*
		System.out.println(controGym.VerificarEntrada("30333390"));

		boolean otroSocio1 = controGym.VerificarEntrada("1231312312");

		boolean otroSocio2 = controGym.VerificarEntrada("1231312312");*/
	}
	
	public void inicializarConexion(String baseDatos, String url) {
		//Inicializo la configuracion
		SingletonConfiguracion config = SingletonConfiguracion.instancia();//Aca se crea el objeto
		config.setBaseDatos(baseDatos);
		config.setUrl(url);
	}

	public void abrirConexion()
	{
		SingletonConfiguracion config = SingletonConfiguracion.instancia();//Aca ya existe el objeto
		Connection con = new Connection(config.getBaseDatos(), config.getUrl());
		if( con.test() ){

		}else{
			//throw new Exception("No se pudo conectar");
		}
	}

	public void insertar(){
		SingletonConfiguracion config = SingletonConfiguracion.instancia();
		Connection con = new Connection(config.getBaseDatos(), config.getUrl());
		con.ejecutarComandoAlaBase("INSERT INTO clientes VALUES (1, 'MARTIN');");
	}
}
