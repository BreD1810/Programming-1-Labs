import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup
{
	private ArrayList<User> userAL;
	
	UserGroup()
	{
		//Constructor - initialise the user list
		userAL = new ArrayList<User>();
	}
	
	public void addSampleData()
	{
		//Create 10 users and add to the arraylist
		User user1 = new User("bg1", "user", "Bradley");
		userAL.add(user1);
		User user2 = new User("fj3", "user", "Francis");
		userAL.add(user2);
		User user3 = new User("amn", "admin", "Andrew");
		userAL.add(user3);
		User user4 = new User("cm2", "admin", "Charlie");
		userAL.add(user4);
		User user5 = new User("pm5", "editor", "Peter");
		userAL.add(user5);
		User user6 = new User("jp2", "user", "Joel");
		userAL.add(user6);
		User user7 = new User("sc1", "user", "Sam");
		userAL.add(user7);
		User user8 = new User("km4", "editor", "Katie");
		userAL.add(user8);
		User user9 = new User("hf2", "user", "Holly");
		userAL.add(user9);
		User user10 = new User("mf5", "user", "Morgan");
		userAL.add(user10);
	}
	
	public User getUser(int slot)
	{
		return userAL.get(slot - 1); //Arraylist is 0 indexed, hence -1
	}
	
	public void printUsernames()
	{
		//Print all usernames and their type in the arraylist
		for(User user: userAL)
		{
			System.out.println(user.getUsername() + " " + user.getUserType());
		}
		
	}
	
	public void removeFirstUser()
	{
		//Remove the first user in the list
		userAL.remove(0);
	}
	
	public void removeLastUser()
	{
		//Remove the last user in the list
		userAL.remove(userAL.size() - 1);
	}
	
	public void removeUser(String username)
	{
		Iterator<User> iter = userAL.iterator();
		//Loop through the entire arraylist
		while(iter.hasNext()) 
		{
			if (iter.next().getUsername() == username)
			{
				//Remove the element if the username matches
				iter.remove();
			}
		}
	}
	
	public Iterator getUserIterator()
	{
		Iterator<User> iter = userAL.iterator();
		return iter;
	}
}