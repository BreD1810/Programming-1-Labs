public class Car extends RoadVehicle implements Refuelable
{
    
	/* Car is going to be an ordinary class.
	 * This is because it will only inherit methods
	 * and properties from other classes. It has no
	 * children. It should extend RoadVehicle, and also
	 * the interface Refuelable*/

	/*Constructor - set the name and capacity of the vehicle 
	 * by passing to the superclass*/
	public Car(String name, int capacity)
	{
		super(name, capacity);
	}
	
	/*Move the car*/
	public void move()
	{
		//Code here to make the car move
	}
	
	/*Refuel the car*/
	public void refuel()
	{
		//Code here for Car refuel
	}
	
	/*Check the tread depth of the car tyres*/
	public void checkTreadDepth()
	{
		//Code here to check tread depth
	}
	
}
