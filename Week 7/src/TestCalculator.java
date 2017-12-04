public class TestCalculator 
{

	/*Check if the parser works correctly*/
	private boolean testParser()
	{
		Calculator calc = new Calculator();
		boolean success = true; //Set to false if any test fails
		
		//Test parsing addition
		if (calc.x("12 + 5") != 17)
		{
			System.out.println("[FAIL] Basic parsing fails to add.");
			success = false;
		}
		else
		{
			System.out.println("[ OK ] Parser adds correctly.");
		}
		
		//Test parsing multiplication
		if (calc.x("12 x 5") != 60)
		{
			System.out.println("[FAIL] Basic parsing fails to multiply.");
			success = false;
		}
		else
		{
			System.out.println("[ OK ] Parser multiplies correctly.");
		}
		
		//Test parsing invalid operator
		if (calc.x("12 [ 3") != null)
		{
			System.out.println("[FAIL] Parser does not return null for operators which are not supported.");
			success = false;
		}
		else
		{
			System.out.println("[ OK ] Parser returns null for operators which are not supported.");
		}
		
		return success;
	}
	
	/*Test if the adding function works correctly*/
	private boolean testAdd()
	{
		Calculator calc = new Calculator();
		boolean success = true; //Set to false if any test fails

		//Test positive numbers
		calc.x = (double)2;
		if (calc.x(new Double(3)) != 5)
		{
			System.out.println("[FAIL] Calculator adds incorrectly");
			success = false;
		}
		else
		{
			System.out.println("[ OK ] Calculator can add positive numbers");
		}
		
		//Test adding negative numbers
		calc.x = (double)-2;
		//Test adding 2 negatives
		if (calc.x(new Double(-3)) != -5)
		{
			System.out.println("[FAIL] Calculator adds with negative numbers incorrectly");
			success = false;
		}
		//Test adding a negative to a positive
		else if (calc.x(new Double(3)) != 1) 
		{
			System.out.println("[FAIL] Calculator adds with negative numbers incorrectly");
			success = false;
		}
		else
		{
			System.out.println("[ OK ] Calculator can add a negative number");
		}
		
		return success;
	}
	
	//Test if the multiplication function works correctly
	private boolean testMultiplication()
	{
		Calculator calc = new Calculator();
		boolean success = true; //Set to false if any test fails

		//Test positive numbers
		calc.x = (double)2;
		if (calc.x((double)3) != 6)
		{
			System.out.println("[FAIL] Calculator multiplies incorrectly");
			success = false;
		}
		else
		{
			System.out.println("[ OK ] Calculator can multiply positive numbers");
		}
		
		//Test negative numbers
		calc.x = (double)-2;
		//Test multiplying two negative numbers
		if (calc.x((double)-3) != 6)
		{
			System.out.println("[FAIL] Calculator multiplies by negative incorrectly");
			success = false;
		}
		//Test multiplying a negative with a positive
		else if (calc.x((double)3) != (double)-6)
		{
			System.out.println("[FAIL] Calculator multiplies by negative incorrectly");
			success = false;
		}
		else
		{
			System.out.println("[ OK ] Calculator can multiply by a negative number");
		}
		
		return success;
	}
	
	public static void main(String[] args)
	{
		TestCalculator testCalc = new TestCalculator();
		
		//Run the test methods
		if(testCalc.testParser() & testCalc.testAdd() && testCalc.testMultiplication())
		{
			System.out.println("Congratulations, your Calculator appears to be working.");
		}
		
	}
}
