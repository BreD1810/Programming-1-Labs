public abstract class RoadVehicle extends Transport
{

	/* RoadVehicle will an abstract class
	 * This is because RoadVehicle will have methods of its own
	 * as well as methods which classes that extend it will need
	 * to have. It will also inherit from Transport.*/

	/*Constructor - set the name and capacity of the vehicle 
	 * by passing to the superclass*/
	public RoadVehicle(String name, int capacity)
	{
		super(name, capacity);
	}
	
	/*Method to check the tread depth on the tire*/
	public abstract void checkTreadDepth();
	
}
