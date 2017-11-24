public class Bicycle extends Cycle
{
    
	/* Bicycle is going to be an ordinary class.
	 * This is because it will only inherit methods
	 * and properties from other classes. It has no
	 * children. It should inherit from the Cycle class.*/
	
	/*Constructor - set the name and capacity of the vehicle 
	 * by passing to the superclass*/
	public Bicycle(String name, int capacity)
	{
		super(name, capacity);
	}
	
	/*Move the bicycle*/
	public void move()
	{
		//Code here to make the bicycle move
	}
	
	/*Check the handle height of the bicycle*/
	public void checkHandleHeight()
	{
		//Code here to check height of the handlbars
	}
	
}
