public class User
{
	private String username;
	private String userType;
	private String name;
	
	User(String usernameParameter, String userTypeParameter, String nameParameter)
	{
		//Constructor - initialise the user with a username, type and name
		username = usernameParameter;
		userType = userTypeParameter;
		name = nameParameter;
	}
	
	public String getUsername()
	{
		//returns the users username
		return username;
	}
	
	public String getUserType()
	{
		//returns the users type
		return userType;
	}
	
	public String getName()
	{
		//returns the users name
		return name;
	}
	
	public void setUserType(String userTypeParameter)
	{
		//Sets the users type with validation
		if (userTypeParameter == "user" || userTypeParameter == "admin" || userTypeParameter == "editor")
		{
			userType = userTypeParameter;
		}
		else
		{
			System.out.println("Invalid user type");
		}
	}
}