abstract class Herbivore extends Animal
{
	
	/*
	 * Make the animal eat some food
	 */
	public void eat(Food food) throws Exception
	{
		//Check if the food is a plant
		if(food instanceof Meat)
		{
			//If it is, throw an exception
			throw new Exception("A herbivore cannot eat meat");
		}
		else
		{
			//Otherwise, they can eat it
			System.out.println("The animal is eating " + food.getName());
		}
	}
	
}
