public class Wolf extends Carnivore
{
	
	/*Constructor - set the name and age using the superclass method*/
	Wolf(String name, int age)
	{
		super(name, age);
	}
	
	/*Second constructor - no arguments*/
	public Wolf()
	{
		super();
	}
	
	/*Print to the console to simulate making a noise*/
	public void makeNoise()
	{
		System.out.println("*Howl*");
	}
	
}
