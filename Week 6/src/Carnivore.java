abstract class Carnivore extends Animal
{
	
	/*Make the animal eat some food, checking if it is meat*/
	public void eat(Food food) throws Exception
	{
		if(food instanceof Plant)
		{
			//If it is a plant, throw an exception
			throw new Exception("A carnivore cannot eat plants");
		}
		else
		{
			//Otherwise, they can eat it
			System.out.println("The animal is eating " + food.getName());
		}
		
	}
	
}
