public class Train extends Transport implements Refuelable
{
   
	/* Train is going to be an ordinary class.
	 * This is because it will only inherit methods
	 * and properties from other classes. It has no
	 * children. It will extend from Transport, and implement
	 * the Refuelable interface. 
	 */
	
	/*Constructor - set the name and capacity of the vehicle 
	 * by passing to the superclass*/
	public Train(String name, int capacity)
	{
		super(name, capacity);
	}
	
	/*Move the train*/
	public void move() 
	{
		//Code here to make the train move
	}
	
	/*Refuel the train*/
	public void refuel()
	{
		//Code here for train refuel
	}
	
}
