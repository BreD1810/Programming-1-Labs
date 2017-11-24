abstract class Omnivore extends Animal
{
	
	/*Constructor - set the name and age using the superclass method*/
	public Omnivore(String name, int age)
	{
		super(name, age);
	}
	
	/*Make the animal eat some food*/
	public void eat(Food food)
	{
		System.out.println("The animal is eating " + food.getName());
	}
	
}
