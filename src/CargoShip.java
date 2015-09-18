
public class CargoShip extends Ship
{
	int capacity;

	public CargoShip(int capacity) 
	{
		super(name, year);
		this.capacity = capacity;
		this.name = name;
		this.year = year;
	}

	public CargoShip() 
	{
		// TODO Auto-generated constructor stub
	}

	public int getCapacity() 
	{
		return capacity;
	}

	public void setCapacity(int capacity) 
	{
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\n Cargo capacity: " + capacity + " tons";
	}
	
	
	
	
	

}
