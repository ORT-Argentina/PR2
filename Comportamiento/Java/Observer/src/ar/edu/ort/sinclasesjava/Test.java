package ar.edu.ort.sinclasesjava;

public class Test {

    public static void main(String[] args) {

        System.out.println("Creo el objeto que 'sensa' la temperatura");// Creo el sensor de la temperatura y los term?metros
        Temperatura temperatura = new Temperatura();
        System.out.println("Creo los term?metros, uno de cada tipo");
        TermometroKelvin tk = new TermometroKelvin(temperatura);
        TermometroFahrenheit tf = new TermometroFahrenheit(temperatura);
        TermometroCelsius tc = new TermometroCelsius(temperatura);
        System.out.println("Cambio la temperatura a 150 K");
        temperatura.setValor(150);
        System.out.println("desuscribo el term?metro Kelvin");//desuscribo el term?metro Kelvin
        tk.desuscribir();
        System.out.println("Cambio la temperatura a 200 K");
        temperatura.setValor(200);
        //desuscribo el term?metro Fahrenheit solo quedar? "escuchando" el Celsius
        System.out.println("desuscribo el term?metro Fahrenheit");
        tf.desuscribir();
        System.out.println("Cambio la temperatura a 300 K");
        temperatura.setValor(300);
        System.out.println("desuscribo el term?metro Celsius");//desuscribo el ?ltimo que quedaba
        tc.desuscribir();
        System.out.println("Cambio la temperatura a 0 K");//nadie informar? este ?ltimo cambio de valor
        temperatura.setValor(0);
    }
}