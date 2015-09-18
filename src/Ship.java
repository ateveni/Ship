import java.util.*;

public class Ship 
{
	String name;
	String year;

	
	public Ship(String name, String	 year) 
	{
		super();
		this.name = name;
		this.year = year;
	}

	public Ship() 
	{
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString()
	{
		return "Ship's name is " + name + " and was built in " + year;
	}
	0
	

}
