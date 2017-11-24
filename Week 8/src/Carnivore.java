abstract class Carnivore extends Animal
{
	
	/*Constructor - set the name and age using the superclass method*/
	public Carnivore(String name, int age)
	{
		super(name, age);
	}
	
	/*Second constructor - no arguments given*/
	public Carnivore()
	{
		super();
	}
	
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
