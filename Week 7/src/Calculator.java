public class Calculator 
{

	Double x;
	
	/*
	 * Chops up input on ' ' then decides whether to add or multiply.
	 * If the string does not contain a valid format returns null.
	 */
	public Double x(String x)
	{
		//Split the string, where there are spaces, into a string array
		String[] expression = x.split(" ");
		
		//Set the 'x' member variable equal to the first operand
		this.x = Double.valueOf(expression[0]);
		
		//Complete an operation based on the operator
		if (expression[1].equals("+"))
		{
			return this.x(new Double(expression[2]));
		}
		else if (expression[1].equals("x"))
		{
			return this.x(Double.parseDouble(expression[2]));
		}
		
		//If the string is not able to be parsed, return null
		return null;
	}

	/*
	 * Adds the parameter x to the instance variable x and returns the answer as a Double.
	 */
	public Double x(Double x)
	{
		System.out.println("== Adding ==");
		//Add the two numbers together
		return new Double(this.x + x);
	}

	/*
	 * Multiplies the parameter x by instance variable x and return the value as a Double.
	 */
	public Double x(double x)
	{
		System.out.println("== Multiplying ==");
		//Multiply the two numbers together
		return new Double(this.x * x);
	}
}
