public class JetPlane extends Transport implements Refuelable
{
    
	/* JetPlane is going to be an ordinary class.
	 * This is because it will only inherit methods
	 * and properties from other classes. It has no
	 * children. It will inherit from Transport, and
	 * implement the Refuelable interface.*/
	
	/*Constructor - set the name and capacity of the vehicle 
	 * by passing to the superclass*/
	public JetPlane(String name, int capacity)
	{
		super(name, capacity);
	}
	
	/*Move the jetplane*/
	public void move()
	{
		//Code here to make the plane move
	}
	
	/*Refuel the jetplane*/
	public void refuel()
	{
		//Code here for JetPlane refuel
	}
	
}
