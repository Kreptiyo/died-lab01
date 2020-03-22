package died.lab01.problema03;
import died.lab01.problema02.*;

public class Registro 
{
	// Atributos
	private String ciudad;
	private Temperatura[] historico;
	private int disponibilidad;
	
	// Constructores
	public Registro()
	{
		this.ciudad = "-";
		this.disponibilidad = 0;
		this.historico = new Temperatura[30];
	}
	
	public Registro(String ciudad)
	{
		this.ciudad = ciudad;
		this.disponibilidad = 0;
		this.historico = new Temperatura[30];
	}
	
	// Metodos
	public String getCiudad()
	{
		return this.ciudad;
	}
	
	public int getDisponibilidad()
	{
		return this.disponibilidad;
	}
	
	public void disminuirDisponibilidad()
	{
		this.disponibilidad++;
	}
	
	public void imprimir()
	{
		System.out.println("TEMPERATURAS REGISTRADAS EN: "+ this.getCiudad());
		for(int i = 0 ; i < this.getDisponibilidad() ; i++)
		{
			System.out.println(+ i);
			System.out.println(" ");
			System.out.println(+ this.historico[i].getGrados());
			
		}
	}
	
	public void agregar(Temperatura t)
	{
		if(this.getDisponibilidad() < 30)
		{
			this.historico[this.getDisponibilidad()] = new Temperatura(t.getGrados(), t.getEscala());
			this.disminuirDisponibilidad();
		}
	}
	
	public void MediaAsCelcius()
	{
		double resultado = 0.0;
		for(int i = 0; i < this.getDisponibilidad() ; i++)
		{
			resultado += this.historico[i].asCelcius();
		}
		resultado /= this.getDisponibilidad();
		System.out.println(+ resultado);
	}
	
	public void MediaAsFahrenheit()
	{
		double resultado = 0.0;
		for(int i = 0; i < this.getDisponibilidad() ; i++)
		{
			resultado += this.historico[i].asFahrenheit();
		}
		resultado /= this.getDisponibilidad();
		System.out.println(+ resultado);
	}
	
	public double maximo()
	{
		double valor = 0.0;
		double mayor = 0.0;
		for(int i = 0 ; i < this.getDisponibilidad() ; i++)
		{
			valor = this.historico[i].getGrados();
			if(valor > mayor)
			{
				mayor = valor;
			}
		}
		return mayor;
	}
	
}
