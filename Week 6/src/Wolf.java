public class Wolf extends Carnivore
{
	
	/*
	 * Constructor
	 * Set the name and age
	 */
	Wolf(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	/*
	 * Print to the console to simulate making a noise
	 */
	public void makeNoise()
	{
		System.out.println("*Howl*");
	}
	
}
