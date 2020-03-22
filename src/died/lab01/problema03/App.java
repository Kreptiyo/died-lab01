package died.lab01.problema03;
import java.util.Random;

import died.lab01.problema02.*;

public class App {

	public static void main(String[] args) 
	{
		Registro r1 =new Registro("DENVER");
		Registro r2 =new Registro("NAIROBI");
		Random generadorAleatorio = new Random();
		for(int i=0;i<10;i++)
		{
			r1.agregar(new Temperatura(generadorAleatorio.nextDouble()*50, Escala.CELCIUS));
		}
		for(int i=0; i<10; i++)
		{
			r2.agregar(new Temperatura(generadorAleatorio.nextDouble()*105, Escala.FAHRENHEIT));
		}
		r1.imprimir();
		System.out.println("Promedio en "+ r1.getCiudad());
		r1.MediaAsCelcius();
		System.out.println("Maximo en:" + r1.getCiudad());
		System.out.println(+ r1.maximo());
		//System.out.println("Maximo en "+r1.getCiudad()+":"+r1.maximo().asCelcius()+" C°");
		r2.imprimir();
		System.out.println("Promedio en "+ r2.getCiudad());
		r2.MediaAsFahrenheit();
		System.out.println("Maximo en:" + r2.getCiudad());
		System.out.println(+ r2.maximo());

	}

}
