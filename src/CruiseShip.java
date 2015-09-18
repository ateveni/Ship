
public class CruiseShip extends Ship
{
	int maxPassengers;

	
	public CruiseShip(String name, int year, int maxPassengers) 
	{
		super(name, year);
		this.maxPassengers = maxPassengers;
	}

	public CruiseShip() 
	{
		// TODO Auto-generated constructor stub
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	@Override
	public String toString() {
		return "Name: " + name + " \nMaximum passengers: " + maxPassengers;
		 
	}
	
	

}
