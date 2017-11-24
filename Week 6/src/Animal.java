abstract class Animal 
{
	
	protected String name;
	protected int age;
	
	/*Constructor - set the name and age*/
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
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
	
}
