abstract class Omnivore extends Animal
{
	
	/*Make the animal eat some food*/
	public void eat(Food food)
	{
		System.out.println("The animal is eating " + food.getName());
	}
	
}
