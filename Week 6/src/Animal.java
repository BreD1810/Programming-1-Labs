abstract class Animal 
{
	
	protected String name;
	protected int age;
	
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
