public abstract class Cycle extends Transport
{
    
	/* Cycle will be an abstract class.
	 * This is because it will have to have certain properties
	 * and methods (not of all of which will have to be inherited
	 * by child classes). It will inherit from Transport.
	 */
	
	/*Constructor - set the name and capacity of the vehicle 
	 * by passing to the superclass*/
	public Cycle(String name, int capacity)
	{
		super(name, capacity);
	}
	
	/*Method to check handle bar height*/
	public abstract void checkHandleHeight();
	
}
