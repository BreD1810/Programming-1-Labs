import java.util.ArrayList;
import java.util.Collections;

public class Demo
{
	
	public static void main(String[] args)
	{
		//Create an arraylist of animals
		ArrayList<Animal> animals = new ArrayList<Animal>();
		
		//Add animals to the arraylist
		animals.add(new Wolf("William", 2));
		animals.add(new Wolf());
		animals.add(new Parrot(3));
		animals.add(new Mouse("Mickey", 1));
		
		/* An interface acts like a 100% abstract class. It creates a contract
		 * between the interface creator and the class creator to ensure
		 * that all methods are included in the implementing class.
		 * This means that any methods defined in an interface will be abstract
		 * and the classes implementing it will have to have all of the methods.
		 * You can implement many interfaces, but you can only extend one class.
		 */

		//Print out all of the animal names and ages before sorting
		for(Animal animal:animals)
		{
			System.out.println("The animals name is: " + animal.getName() + ". It's age is: " + animal.getAge());
		}
		
		//Sort the list of animals
		Collections.sort(animals);
		System.out.println("The animals have now been sorted.");
		
		//Print out all of the animal names and ages after sorting
		for(Animal animal:animals)
		{
			System.out.println("The animals name is: " + animal.getName() + ". It's age is: " + animal.getAge());
		}
		
		/* To sort the animals from highest to lowest age, you would have to use the
		 * compareTo method on the animals in the arraylist one by one.
		 * You could use a bubble sort, for example (this compares neighbouring elements
		 * in passes until no swaps are made).
		 */
		
	}
	
}
