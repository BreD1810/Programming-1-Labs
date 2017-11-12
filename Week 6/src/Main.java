public class Main 
{
	
	public static void main(String[] args)
	{
		/*
		 * Create animals
		 */
		Wolf myWolf = new Wolf("Wiliam", 5);
		Parrot myParrot = new Parrot("Percy", 3);
		Mouse myMouse = new Mouse("Mickey", 1);
		
		/*
		 * Get names and ages of the animals
		 */
		System.out.println("There is a wolf named " + myWolf.getName() + " aged " + myWolf.getAge());
		System.out.println("There is a parrot named " + myParrot.getName() + " aged " + myParrot.getAge());
		System.out.println("There is a mouse named " + myMouse.getName() + " aged " + myMouse.getAge());
		
		/*
		 * Get the animals to make noises
		 */
		myParrot.makeNoise();
		myWolf.makeNoise();
		myMouse.makeNoise();
		
		/*
		 * Create food
		 */
		Meat meatFood = new Meat("Beef");
		Plant plantFood = new Plant("Lettuce");
		
		/*
		 * Attempt to feed the animals
		 */
		try
		{
			//With correct food
			myParrot.eat(meatFood);
			myParrot.eat(plantFood);
			myWolf.eat(meatFood);
			myMouse.eat(plantFood);
			
			//With incorrect food
			myWolf.eat(plantFood);
			myMouse.eat(meatFood);
		}
		catch(Exception exception)
		{
			//Print error to the console if exception is thrown
			System.err.println(exception);
		}
		
	}
	
}
