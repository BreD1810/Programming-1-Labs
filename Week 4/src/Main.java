import java.util.Iterator;

public class Main 
{
	
	public static void main(String[] args) 
	{	
		Toolbox myToolbox = new Toolbox();
		int number;
		
		//Input a number from the user using toolbox
		number = myToolbox.readIntegerFromCmd();
		
		/*
		 * Print a multiplication sequence for the users number using a for loop
		 */
		for(int i = 1; i <= 20; i++)
		{
			System.out.println(number * i);
		}
		
		/*
		 * Calculate how many successive integers need to be summed to make a total over 500.
		 */
		int sum = 0;
		int counter = 1;
		while(sum <= 500)
		{
			//Add the counter to the sum, using the counter to count iterations and sum to track the total
			sum = sum + counter;
			counter ++;
		}
		System.out.println("The total is " + sum + ". " + counter + " iterations were needed to do this.");
		System.out.println();

		/*
		 * Create a new UserGroup, add data, and print all of the usernames from the group
		 */
		UserGroup userGroup = new UserGroup();
		userGroup.addSampleData();
		System.out.println("Here are the users:");
		userGroup.printUsernames();
		System.out.println();

		/*
		 * Remove users from the group
		 */
		userGroup.removeFirstUser();
		userGroup.removeLastUser();
		userGroup.removeUser("pm5");
		System.out.println("Removed the first and last user, and user pm5. Printing the groups updated usernames.");
		userGroup.printUsernames();
		System.out.println();

		/*
		 * Create an adminitstrators group
		 */
		UserGroup administrators = new UserGroup();
		administrators.addSampleData();
		Iterator<User> adminIter = administrators.getUserIterator();
		//Loop through all users
		while (adminIter.hasNext())
		{
			//Remove the user if they're not an admin
			if (adminIter.next().getUserType() != "admin")
			{
				adminIter.remove();
			}
		}

		/*
		 * Print all admins
		 */
		System.out.println("Here are the administrators:");
		administrators.printUsernames();
		System.out.println();

		/*
		 * Change last admin's type to user
		 */
		administrators.getUser(2).setUserType("user");
		System.out.println("Last admin user has been changed to type user");
		System.out.println();
		
		/*
		 * Print both user groups
		 */
		System.out.println("Users:");
		userGroup.printUsernames();
		System.out.println();
		System.out.println("Admins:");
		administrators.printUsernames();

		/*
		 *Changing the users type in the administrators group means that they are no longer an admin,
		 * yet are in the administrators group. This issue could be solved by rerunning the code
		 * that removes non-admins from the admins group.
		 */
	}
	
}