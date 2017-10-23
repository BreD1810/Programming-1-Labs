public class FizzBuzz { //Class decleration.
	
	public static void main(String[] args) { //Main method.
	
		for(Integer i = new Integer(1); i < 61; i++) { //Loops through the integers 1 to 60.
			if(i % 3 == 0) { //Executes if the current number is a multiple of 3.
				System.out.print("Fizz"); //Prints Fizz.
			}
			
			if(i % 5 == 0) { //Executes if the current number is a multiple of 5.
				System.out.print("Buzz"); //Prints Buzz.
			}
			
			if(i % 3 != 0 && i % 5 != 0) { //Executes if the current number is not a multiple of 3 and not a multiple of 5.
				System.out.print(i); //Prints the current number.
			}

			System.out.println(); //Puts the console onto a new line to break up the output.
		}
		
	}
	
}