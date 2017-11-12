public class User
{
	
	private String username;
	private String userType;
	private String name;
	
	/*
	 * Constructor - initialise the user with a username, type and name
	 */
	User(String username, String userType, String name)
	{
		this.username = username;
		this.userType = userType;
		this.name = name;
	}
	
	/*
	 * Return the user's username
	 */
	public String getUsername()
	{
		return username;
	}
	
	/*
	 * Return the user's type
	 */
	public String getUserType()
	{
		return userType;
	}
	
	/*
	 * Return the user's name
	 */
	public String getName()
	{
		return name;
	}
	
	/*
	 * Set the users type, validating that the type supplied is correct
	 */
	public void setUserType(String userType)
	{
		//Check if the userType is user, admin or editor
		if (userType == "user" || userType == "admin" || userType == "editor")
		{
			//If it is, change the user's type as supplied
			this.userType = userType;
		}
		else
		{
			//Otherwise, print an error message
			System.out.println("Invalid user type");
		}
	}
}