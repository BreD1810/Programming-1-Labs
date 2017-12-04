abstract class Animal implements Comparable<Animal>
{
	
	protected String name;
	protected int age;
	
	/*Compare this animal's age to another animal's*/
	public int compareTo(Animal inputAnimal)
	{
		if(inputAnimal.getAge() > this.getAge())
		{
			//Return a negative value if the current object is less than the given object
			return -1;
		}
		else if(inputAnimal.getAge() < this.getAge())
		{
			//Return a positive value if the current object is more than the given object
			return 1;
		}
		
		//Return 0 if they are equal
		return 0;
	}
	
	/*Constructor - set the name and age*/
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	/*Second constructor - no arguments given*/
	public Animal()
	{
		//Call the other constructor using the name "newborn" and age 0
		this("newborn", 0);
	}
	
	/*Return the name*/
	public String getName()
	{
		return name;
	}
	
	/*Return the age*/
	public int getAge()
	{
		return age;
	}
	
	/*Method to make a noise*/
	abstract void makeNoise();
	
	/*Method to make the animal eat*/
	abstract void eat(Food food) throws Exception;
	
	/*Make an animal eat a select number of times*/
	public void eat(Food food, int numberOfTimes) throws Exception
	{
		//Keep eating for the number of times input
		while(numberOfTimes > 0)
		{
			eat(food);
			numberOfTimes--; //Subtract 1
		}
	}
}
