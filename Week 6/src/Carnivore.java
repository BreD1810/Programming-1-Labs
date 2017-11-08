abstract class Carnivore extends Animal
{
	
	/*
	 * Make the animal eat some food
	 */
	public void eat(Food food) throws Exception
	{
		//Check if the food is a plant
		if(food instanceof Plant)
		{
			//If it is, throw an exception
			throw new Exception("A carnivore cannot eat plants");
		}
		else
		{
			//Otherwise, they can eat it
			System.out.println("The animal is eating " + food.getName());
		}
		
	}
	
}
