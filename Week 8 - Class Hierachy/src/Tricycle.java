public class Tricycle extends Cycle
{
    
	/* Tricycle is going to be an ordinary class.
	 * This is because it will only inherit methods
	 * and properties from other classes. It has no
	 * children. It will inherit from Cycle*/
	
	/*Constructor - set the name and capacity of the vehicle 
	 * by passing to the superclass*/
	public Tricycle(String name, int capacity)
	{
		super(name, capacity);
	}
	
	/*Move the tricycle*/
	public void move()
	{
		//Code here to make the tricycle move
	}
	
	/*Check the handle bar height of the tricycle*/
	public void checkHandleHeight()
	{
		//Code here to check height of the handlbars
	}
	
}
