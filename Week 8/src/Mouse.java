public class Mouse extends Herbivore
{
	
	/*Constructor - set the name and age using the superclass method*/
	public Mouse(String name, int age)
	{
		super(name, age);
	}
	
	/*Print to the console to simulate making a noise*/
	public void makeNoise()
	{
		System.out.println("*Squeak*");
	}
	
}
