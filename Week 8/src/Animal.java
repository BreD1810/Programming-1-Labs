abstract class Animal implements Comparable<Animal>
{
	
	protected String name;
	protected int age;
	
	public int compareTo(Animal inputAnimal)
	{
		if(inputAnimal.getAge() > this.getAge())
		{
			return -1;
		}
		else if(inputAnimal.getAge() < this.getAge())
		{
			return 1;
		}
		
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
		while(numberOfTimes > 0)
		{
			eat(food);
			numberOfTimes--; //Subtract 1
		}
	}
}
