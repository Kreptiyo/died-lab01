package died.lab01.problema02;

public class Temperatura 
{
	// Atributos
	private double grados;
	private Escala escala;
	
	// Constructores
	public Temperatura()
	{
		this.grados = 0;
		this.escala = Escala.CELCIUS;
	}
	
	public Temperatura(double grados, Escala escala)
	{
		this.grados = grados;
		this.escala = escala;
	}
	
	
	// Metodos
	
	public double getGrados()
	{
		return this.grados;
	}
	
	public Escala getEscala()
	{
		return this.escala;
	}
	
	public void setGrados(double grados)
	{
		this.grados = grados;
	}
	
	public void setEscala(Escala escala)
	{
		this.escala = escala;
	}
	
	public String toString() 
	{
		return super.toString();
	}
	
	public double asCelcius()
	{
		double resultado = 0.0;
		if(this.getEscala() != Escala.CELCIUS)
		{
			resultado = (this.getGrados() - 32) * 5/9;
			return resultado;
		}
		else
		{
			return this.getGrados();
		}
	}
	
	public double asFahrenheit()
	{
		double resultado = 0.0;
		if(this.getEscala() != Escala.FAHRENHEIT)
		{
			resultado = this.getGrados() * 1.8 + 32;
			return resultado;
		}
		else
		{
			return this.getGrados();
		}
	}
	
	public void aumentar(Temperatura temperatura)
	{
		double temperaturaConvertida = 0.0;
		double temperaturaAumentada = 0.0;
		if(temperatura.getGrados() > 0.0)
		{
			if(this.getEscala() == Escala.CELCIUS && temperatura.getEscala() == Escala.FAHRENHEIT)
			{
				temperaturaConvertida = temperatura.asCelcius();
				temperaturaAumentada = this.getGrados() + temperaturaConvertida;
				this.setGrados(temperaturaAumentada);
			}
			if(this.getEscala() == Escala.FAHRENHEIT && temperatura.getEscala() == Escala.CELCIUS)
			{
				temperaturaConvertida = temperatura.asFahrenheit();
				temperaturaAumentada = this.getGrados() + temperaturaConvertida;
				this.setGrados(temperaturaAumentada);
			}
			else
			{
				temperaturaAumentada = this.getGrados() + temperatura.getGrados();
				this.setGrados(temperaturaAumentada);
			}
		}
	}
	
	public void disminuir(Temperatura temperatura)
	{
		double temperaturaConvertida = 0.0;
		double temperaturaDisminuida = 0.0;
		if(temperatura.getGrados() > 0.0)
		{
			if(this.getEscala() == Escala.CELCIUS && temperatura.getEscala() == Escala.FAHRENHEIT)
			{
				temperaturaConvertida = temperatura.asCelcius();
				temperaturaDisminuida = this.getGrados() - temperaturaConvertida;
				this.setGrados(temperaturaDisminuida);
			}
			if(this.getEscala() == Escala.FAHRENHEIT && temperatura.getEscala() == Escala.CELCIUS)
			{
				temperaturaConvertida = temperatura.asFahrenheit();
				temperaturaDisminuida = this.getGrados() - temperaturaConvertida;
				this.setGrados(temperaturaDisminuida);
			}
			else
			{
				temperaturaDisminuida = this.getGrados() - temperatura.getGrados();
				this.setGrados(temperaturaDisminuida);
			}
		}
	}
	
}
