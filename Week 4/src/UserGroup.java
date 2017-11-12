import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup
{
	
	private ArrayList<User> userList;
	
	/*
	 * Constructor - initialise the user list as an empty arraylist of type User
	 */
	UserGroup()
	{
		userList = new ArrayList<User>();
	}
	
	/*
	 * Create 10 users and add them to the user list
	 */
	public void addSampleData()
	{
		User user1 = new User("bg1", "user", "Bradley");
		userList.add(user1);
		User user2 = new User("fj3", "user", "Francis");
		userList.add(user2);
		User user3 = new User("amn", "admin", "Andrew");
		userList.add(user3);
		User user4 = new User("cm2", "admin", "Charlie");
		userList.add(user4);
		User user5 = new User("pm5", "editor", "Peter");
		userList.add(user5);
		User user6 = new User("jp2", "user", "Joel");
		userList.add(user6);
		User user7 = new User("sc1", "user", "Sam");
		userList.add(user7);
		User user8 = new User("km4", "editor", "Katie");
		userList.add(user8);
		User user9 = new User("hf2", "user", "Holly");
		userList.add(user9);
		User user10 = new User("mf5", "user", "Morgan");
		userList.add(user10);
	}
	
	/*
	 * Return the user in the supplied slot
	 */
	public User getUser(int slot)
	{
		//Arraylist is 0 indexed, hence -1 in the parameter
		return userList.get(slot - 1); 
	}
	
	/*
	 * Print all usernames and their type from the arraylist
	 */
	public void printUsernames()
	{
		//Loop through all users in the userlist
		for(User user: userList)
		{
			//Print their username and type
			System.out.println(user.getUsername() + " " + user.getUserType());
		}
		
	}
	
	/*
	 * Remove the first user in the list
	 */
	public void removeFirstUser()
	{
		userList.remove(0);
	}
	
	/*
	 * Remove the last user in the list
	 */
	public void removeLastUser()
	{
		userList.remove(userList.size() - 1);
	}
	
	/*
	 * Remove a user with a supplied username
	 */
	public void removeUser(String username)
	{
		Iterator<User> iter = userList.iterator();
		//Loop through the entire arraylist
		while(iter.hasNext()) 
		{
			//Remove the element if the username matches
			if (iter.next().getUsername() == username)
			{
				//Remove from the iterator, not the arraylist (to avoid ConcurrentModificationException
				iter.remove();
			}
		}
	}
	
	public Iterator<User> getUserIterator()
	{
		Iterator<User> iter = userList.iterator();
		return iter;
	}
}