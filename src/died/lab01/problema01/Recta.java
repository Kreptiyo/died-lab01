package died.lab01.problema01;

public class Recta 
{
	private float x0;
	private float x1;
	private float y0;
	private float y1;
	
	public Recta(Punto p1, Punto p2)
	{
		this.x0 = p1.getX();
		this.x1 = p2.getX();
		this.y0 = p1.getY();
		this.y1 = p2.getY();
	}
	
	public Recta()
	{
		this.x0 = 1;
		this.x1 = 1;
		this.y0 = 1;
		this.y1 = 1;
	}
	
	public float getX0() 
	{
		return x0;
	}
	
	public float getY0() 
	{
		return y0;
	}
	
	public float pendiente()
	{
		float m;
		m = (this.y1 - this.y0) / (this.x1 - this.x0);
		return m;
	}
	
	public boolean paralelas(Recta otraRecta)
	{
		if(this.pendiente() == otraRecta.pendiente())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean equals(Object otraRecta)
	{
		Punto pto1 = new Punto(this.getX0(), this.getY0());
		Punto pto2 = new Punto(((Recta) otraRecta).getX0(), ((Recta)otraRecta).getY0());
		Recta r3 = new Recta(pto1, pto2);
		if(this.getClass() == null || this.getClass() != otraRecta.getClass())
		{
			return false;
		}
		else
		{
			if(this.pendiente() == r3.pendiente() && ((Recta) otraRecta).pendiente() == r3.pendiente())
			{
				return true;
			}
		}
		return false;
		
	}
}
