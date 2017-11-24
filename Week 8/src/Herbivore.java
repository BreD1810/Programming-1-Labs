abstract class Herbivore extends Animal
{

	/*Constructor - set the name and age using the superclass method*/
	public Herbivore(String name, int age)
	{
		super(name, age);
	}
	
	/*Make the animal eat some food, checking if it is a plant*/
	public void eat(Food food) throws Exception
	{
		if(food instanceof Meat)
		{
			//If it is meat, throw an exception
			throw new Exception("A herbivore cannot eat meat");
		}
		else
		{
			//Otherwise, they can eat it
			System.out.println("The animal is eating " + food.getName());
		}
	}
	
}
