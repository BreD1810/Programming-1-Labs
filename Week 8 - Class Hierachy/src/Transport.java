public abstract class Transport
{
    
	/* Transport will be an abstract class.
	 * The classes that extend Transport will need to implement
	 * some it's methods (hence abstract), but it may have
	 * methods of it's own.
	 */
	
	private int capacity;
	private String name;
	
	/*Constructor - set the name and capacity*/
	public Transport(String name, int capacity)
	{
		setName(name);
		setCapacity(capacity);
	}
	
	/*Return the capacity*/
	public int getCapacity()
	{
		return capacity;
	}
	
	/*Set the capacity*/
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	
	/*Return the name*/
	public String getName()
	{
		return name;
	}
	
	/*Set the name*/
	public void setName(String name)
	{
		this.name = name;
	}
	
	/*Make the transport method move - all child classes need to have this method*/
	public abstract void move();
	
}
